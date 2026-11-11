package six.plain;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import six.dao.PlainSingerDao;
import six.dao.SingerDao;
import six.pojos.Singer;
import java.time.LocalDate;

public class PlainJdbcDemo {
    private static final Logger logger = LoggerFactory.getLogger(PlainJdbcDemo.class);
    private static SingerDao singerDao = new PlainSingerDao();

    static {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException cnf) {
            logger.error("Problem loading DB Driver!", cnf);
        }
    }
    public static void main(String... args) {
        logger.info("Starting main");

        listAllSingers();

        logger.info("Inserting a record(Singer)");
        Singer singer = new Singer();
        singer.setFirstName("Kishore");
        singer.setLastName("Kumar");
        singer.setBirthDate(LocalDate.of(1991, 3, 1));

        singerDao.insert(singer);
        logger.info("The singer ID is {}", singer.getId());

        logger.info("Listing all singers");
        listAllSingers();

        logger.info("Deleting a singer");
        singerDao.delete(singer.getId());
        listAllSingers();
    }
    private static void listAllSingers() {
        var singers = singerDao.findAll();
        for(Singer singer: singers) {
            logger.info(singer.toString());
        }
    }
}
