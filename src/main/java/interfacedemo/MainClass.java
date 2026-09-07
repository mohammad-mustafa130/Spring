package interfacedemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainClass {
    public static void main(String[] args) {
        var ctx = new AnnotationConfigApplicationContext(MyConfig.class);
        ctx.registerShutdownHook();
        MyComponent mc = ctx.getBean(MyComponent.class);
        mc.mb.display();
    }
}
