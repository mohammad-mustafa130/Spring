package interfacedemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfig {
    @Bean(initMethod = "init")
    public MyBean bean1() {
        MyBean mb = new MyBean();
        mb.setBeanName("Mustafa");
        return mb;
    }
    @Bean
    public MyComponent bean2() {
        MyComponent mc = new MyComponent();
        mc.setMb(bean1());
        return mc;
    }
}
