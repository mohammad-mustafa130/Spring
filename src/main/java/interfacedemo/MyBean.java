package interfacedemo;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class MyBean implements InitializingBean, DisposableBean, BeanNameAware {
    private String name;
    @Override
    public void setBeanName(String name) {
        this.name = name;
        System.out.println(name);
    }
    public void display() {
        System.out.println("Display method");
    }
    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("InitializingBean method");
    }
    @PostConstruct
    public void afterMethod() {
        System.out.println("PostConstruct method");
    }
    public void init() {
        System.out.println("Init method");
    }
    @Override
    public void destroy() {
        System.out.println("DisposableBean method");
    }
    @PreDestroy
    public void preDestroyMethod() {
        System.out.println("PreDestroy method");
    }
    public void destroyMethod() {
        System.out.println("Destroy method");
    }
}
