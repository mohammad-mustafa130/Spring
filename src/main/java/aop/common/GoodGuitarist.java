package aop.common;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class GoodGuitarist implements Singer {
    private static final Logger logger = LoggerFactory.getLogger(GoodGuitarist.class);

    @Override
    public void sing() {
        logger.info("I Am A Disco Dancer");
    }
}
