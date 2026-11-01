package aop.common;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class GrammyGuitarist implements Singer {
    private static final Logger logger = LoggerFactory.getLogger(GrammyGuitarist.class);

    @Override
    public void sing() {
        logger.info("sing: Gravity is working against me");
    }
    public void sing(Guitar guitar) {
        logger.info("play: " + guitar.play());
    }
    public void talk() {
        logger.info("talk");
    }
    public void rest() {
        logger.info("zzz");
    }
}
