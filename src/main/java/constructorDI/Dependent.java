package constructorDI;

import org.springframework.stereotype.Component;

@Component
public class Dependent {
    Dependency d;
    public Dependent(Dependency d) {
        this.d = d;
    }
    public void demoMethod() {
        System.out.println("This is demo method");
        d.myMethod();
        System.out.println("End of demo method");
    }
}
