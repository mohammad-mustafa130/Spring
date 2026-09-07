package collectionapi;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@Configuration
@ComponentScan
public class DemoConfiguration {
    @Bean
    public List<Integer> list() {
        List<Integer> li = new ArrayList<>();
        li.add(10);
        li.add(20);
        li.add(30);

        return li;

    }
}
