package singleton;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class A {
    @Autowired
    BeanDemo bd;
    public A() {
        System.out.println("Constructor of A");
    }
}
