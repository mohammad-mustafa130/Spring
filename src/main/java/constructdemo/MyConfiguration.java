package constructdemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfiguration {
    @Bean(destroyMethod = "init")
    MyClass bean1() {
        MyClass m = new MyClass();
        m.setName("Ajay Kumar");
        m.setAge(30);
        return m;
    }
    @Bean(destroyMethod= "init")
    MyClass bean2() {
        MyClass m = new MyClass();
        m.setName("Dheeraj");
        return m;
    }
    @Bean(destroyMethod = "init")
    MyClass bean3() {
        MyClass m = new MyClass();
        m.setAge(25);
        return m;
    }
}
