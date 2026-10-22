package aop.common;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AnnotedGuitarist implements Singer {
    private static final Logger logger = LoggerFactory.getLogger(AnnotedGuitarist.class);

    @Override
    public void sing() { }

    @AdviceRequired
    public void sing(Guitar guitar) {
        logger.info("Play: " + guitar.play());
    }

    public void rest() {
        logger.info("zzzz");
    }
}