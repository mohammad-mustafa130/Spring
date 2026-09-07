package autowireddemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("beanwrapper")
public class BeanWrapper {
    BeanDemo bd;
    @Autowired
    BeanWrapper(BeanDemo bd) {
        this.bd = bd;
    }
    @Value("#{beandemo.meraAge}")
    int ageMax;
    @Value("#{beandemo.meraName.toUpperCase()}")
    String fullName;
}
