package singleton;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class B {
    @Autowired
    BeanDemo bd;
    public B() {
        System.out.println("Constructor of B");
    }
}
