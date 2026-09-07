package collectionapi;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainClass {
    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(DemoConfiguration.class);
        CollectionDemoBean cd = ctx.getBean(CollectionDemoBean.class);
        cd.display();
    }
}
