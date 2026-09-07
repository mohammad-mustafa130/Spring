package setterDI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("dependent")
public class Dependent {
    @Autowired
    private Dependency dep;
    public void demoMethod() {
        System.out.println("This is demo method");
        dep.myMethod();
        System.out.println("End of demo method");
    }
}
