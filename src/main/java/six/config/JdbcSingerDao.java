package six.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.BeanCreationException;
import org.springframework.beans.factory.InitializingBean;

import javax.sql.DataSource;
import java.sql.SQLException;

public class JdbcSingerDao implements SingerDao, InitializingBean {
    private static final Logger logger = LoggerFactory.getLogger(JdbcSingerDao.class);
    private DataSource dataSource;

    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
    }
    @Override
    public void afterPropertiesSet() throws SQLException {
        if(dataSource == null) {
            throw new BeanCreationException("Must set datasource on SingerDao");
        }
    }
    @Override
    public String findNameById(Long id) {
        var result = "";
        try(var connection = dataSource.getConnection();
            var statement = connection.prepareStatement("SELECT FIRST_NAME, LAST_NAME FROM SINGER WHERE ID = " + id);
            var resultSet = statement.executeQuery()) {
            while (resultSet.next()) {
                return resultSet.getString("FIRST_NAME") + " " + resultSet.getString("LAST_NAME");
            }
        } catch (Exception ex) {
            logger.error("Problem when executing SELECT!", ex);
        }
        return result;
    }

}
