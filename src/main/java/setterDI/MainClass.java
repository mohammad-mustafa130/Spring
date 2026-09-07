package setterDI;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainClass {
    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(BeanConf.class);
        Dependent dp = ctx.getBean("dependent", Dependent.class);
        dp.demoMethod();
    }
}
