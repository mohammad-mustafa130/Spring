package byname;

import org.springframework.stereotype.Component;

@Component("autodemo")
public class AutoDemo {
    public void printer() {
        System.out.println("printer method");
    }
}
