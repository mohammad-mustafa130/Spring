package six.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import javax.sql.DataSource;

@Import(BasicDataSourceCfg.class)
@Configuration
public class SpringDataSourceCfg {
    private static final Logger logger = LoggerFactory.getLogger(SpringDataSourceCfg.class);

    @Autowired
    DataSource dataSource;

    @Bean
    public SingerDao singerDao() {
        JdbcSingerDao dao = new JdbcSingerDao();
        dao.setDataSource(dataSource);
        return dao;
    }
}
