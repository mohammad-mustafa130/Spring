package constructdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainClass {
    public static void main(String[] args) {
        var ctx = new AnnotationConfigApplicationContext(MyConfiguration.class);
        MyClass m1 = (MyClass) ctx.getBean("bean1");
        MyClass m2 = (MyClass) ctx.getBean("bean2");
        MyClass m3 = (MyClass) ctx.getBean("bean3");

        System.out.println(m1);
        System.out.println(m2);
        System.out.println(m3);

        ctx.close();
    }
}
