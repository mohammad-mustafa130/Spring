package collectionapi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class CollectionDemoBean {
    @Autowired
    List<Integer> li;
    public void display() {
        for(Integer i : li) {
            System.out.println(i);
        }
    }
}
