package test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainClass {
    public static void main(String[] args) {
        var ctx = new AnnotationConfigApplicationContext(MyConfig.class);
        A a = ctx.getBean(A.class);
        a.display();
    }
}
