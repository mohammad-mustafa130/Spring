package constructorDI;

import org.springframework.stereotype.Component;

@Component
public class Dependency {
    public void myMethod() {
        System.out.println("This is my method");
    }
}
