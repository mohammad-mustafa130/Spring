package test;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfig {
    @Bean(initMethod = "init")
    public C bean1() {
        return new C();
    }
    @Bean(initMethod = "init")
    public B bean2() {
        return new B(bean1());
    }
    @Bean(initMethod = "init")
    public A bean3() {
        return new A(bean2());
    }

}
