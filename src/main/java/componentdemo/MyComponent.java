package componentdemo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class MyComponent {
    private final int age;
    public MyComponent(@Value("24") int age) {
        this.age = age;
    }
    public static void main(String[] args) {
        var ctx = new AnnotationConfigApplicationContext();
        ctx.register(MyComponent.class);
        ctx.refresh();
        var m = ctx.getBean(MyComponent.class);
        m.display();
    }
    public void display() {
        System.out.println(age);
    }
}
