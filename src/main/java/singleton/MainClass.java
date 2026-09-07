package singleton;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainClass {
    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(appconfig.class);
        A a = ctx.getBean(A.class);
        System.out.println("Between Instantiation");
        B b = ctx.getBean(B.class);
        a.bd.setAge(50);
        System.out.println(b.bd.getAge());
    }
}
