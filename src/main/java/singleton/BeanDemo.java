package singleton;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class BeanDemo {
    @Value("20")
    int age;
    public void setAge(int age) {
        this.age = age;
    }
    public int getAge() {
        return age;
    }
}
