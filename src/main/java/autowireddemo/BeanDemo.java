package autowireddemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("beandemo")
public class BeanDemo {
    private int age = 30;
    private String name = "Amit Singh";
    public int meraAge() {
        return age;
    }
    public String meraName() {
        return name;
    }
    @Autowired
    public BeanDemo() {}
}
