package six.dao;

import six.pojos.Singer;
import java.util.Set;

public interface SingerDao extends CoreDao {
    Set<Singer> findAll();
    //Set<Singer> findByFirstName(String firstName);
    Singer insert(Singer singer);
    //void update(Singer singer);
    void delete(Long singerId);
}
