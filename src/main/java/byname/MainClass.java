package byname;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainClass {
    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(MyConfiguration.class);
        TargetDemo td = ctx.getBean(TargetDemo.class);
        //td.ad.printer();
    }
}
