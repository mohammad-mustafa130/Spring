package aop;

import org.slf4j.*;
import static java.time.Duration.ofMillis;

public class Concert implements Performance {
    private static Logger logger = LoggerFactory.getLogger(Concert.class);

    @Override
    public void execute() {
        logger.info("... La la la ...");

        try {
            Thread.sleep(ofMillis(2000).toMillis());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}