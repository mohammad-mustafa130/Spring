package componentdemo;

import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;

@Component
public class PostDemo {
    public void display() {
        System.out.println("Display method");
    }
    @PreDestroy
    public void demoPost() {
        System.out.println("demoPost Called");
    }
}
