package six.dao;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import six.pojos.Singer;
import java.util.HashSet;
import java.util.Set;
import java.sql.*;

public class PlainSingerDao implements SingerDao {
    private static final Logger logger = LoggerFactory.getLogger(PlainSingerDao.class);

    @Override
    public Set<Singer> findAll() {
        Set<Singer> result = new HashSet<>();
        try(var connection = getConnection()) {
            String query = "SELECT * FROM SINGER";
            var statement = connection.prepareStatement(query);
            var resultSet = statement.executeQuery();

            while(resultSet.next()) {
                var singer = new Singer();
                singer.setId(resultSet.getLong("ID"));
                singer.setFirstName(resultSet.getString("FIRST_NAME"));
                singer.setLastName(resultSet.getString("LAST_NAME"));
                singer.setBirthDate(resultSet.getDate("BIRTH_DATE").toLocalDate());
                result.add(singer);
            }
        } catch(SQLException ex) {
            logger.error("Problem when executing SELECT!", ex);
        }
        return result;
    }
    @Override
    public Singer insert(Singer singer) {
        try (var connection = getConnection()) {
            String query = "INSERT INTO SINGER (FIRST_NAME, LAST_NAME, BIRTH_DATE) VALUES (?, ?, ?)";
            var statement = connection.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
            statement.setString(1, singer.getFirstName());
            statement.setString(2, singer.getLastName());
            statement.setDate(3, java.sql.Date.valueOf(singer.getBirthDate()));
            statement.execute();
            var generatedKeys = statement.getGeneratedKeys();
            if (generatedKeys.next()) {
                singer.setId(generatedKeys.getLong(1));
            }
            return singer;
        } catch (SQLException ex) {
            logger.error("Problem executing INSERT", ex);
        }
        return null;
    }
    @Override
    public void delete(Long singerId) {
        try (var connection = getConnection()) {
            String query = "DELETE FROM SINGER WHERE id = ?";
            var statement = connection.prepareStatement(query);
            statement.setLong(1, singerId);
            statement.execute();
        } catch (SQLException ex) {
            logger.error("Problem executing DELETE", ex);
        }
    }
}
