package aop.common;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Guitarist implements Singer {
    private static final Logger logger = LoggerFactory.getLogger(Guitarist.class);

    @Override
    public void sing() {
        logger.info("Just keep me where the light is");
    }
    public void singasong() {
        logger.info("And wrap in your arms");
    }
    public void rest() {
        logger.info("zzz");
    }
}
