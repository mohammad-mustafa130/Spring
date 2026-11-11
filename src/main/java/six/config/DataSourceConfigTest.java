package six.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import javax.sql.DataSource;
import java.sql.SQLException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class DataSourceConfigTest {
    private static final Logger logger = LoggerFactory.getLogger(DataSourceConfigTest.class);

    @Test
    public void testSpringJdbc() throws SQLException {
        var ctx = new AnnotationConfigApplicationContext(SpringDataSourceCfg.class);
        var dataSource = ctx.getBean("dataSource", DataSource.class);
        assertNotNull(dataSource);
        testdataSource(dataSource);
        var singerDao = ctx.getBean("singerDao", SingerDao.class);
        assertEquals("Kishore Kumar", singerDao.findNameById(6L));
        ctx.close();
    }
    private void testdataSource(DataSource dataSource) throws SQLException {
        try(var conn = dataSource.getConnection();
            var stmt = conn.prepareStatement("SELECT ID FROM SINGER");
            var rs = stmt.executeQuery()) {
            while(rs.next()) {
                System.out.println(rs.getInt("ID"));
            }
        } catch (SQLException sqle) {
            logger.debug("Something went wrong", sqle);
        }
    }
}
