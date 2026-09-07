package setterDI;

import org.springframework.stereotype.Component;

@Component("dependency")
public class Dependency {
    public void myMethod() {
        System.out.println("This is my method");
    }
}
