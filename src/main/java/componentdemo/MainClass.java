package componentdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainClass {
    public static void main(String[] args) {
        var ctx = new AnnotationConfigApplicationContext("componentdemo");
        PostDemo pd = ctx.getBean(PostDemo.class);
        pd.display();

        ctx.close();
    }
}
