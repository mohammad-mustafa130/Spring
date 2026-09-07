package byname;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TargetDemo {
    AutoDemo ad;
    @Autowired
    public TargetDemo(AutoDemo ad) {
        this.ad = ad;
        System.out.println("Constructor with argument");
    }
    @Autowired
    public void setAutoDemo(AutoDemo ad) {
        this.ad = ad;
        System.out.println("setter method");
    }
    /*public TargetDemo() {
        ad = null;
        System.out.println("Constructor with no argument");
    }*/
}
