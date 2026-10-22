package aop.manual;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.aop.MethodBeforeAdvice;
import org.springframework.lang.NonNull;

import java.lang.reflect.Method;

public class SimpleBeforeAdvice implements MethodBeforeAdvice {
    private static final Logger logger = LoggerFactory.getLogger(SimpleBeforeAdvice.class);

    @Override
    public void before (@NonNull Method method, @NonNull Object[] args, Object target) throws Throwable {
        logger.info("Before: set up concert hall.");
    }
}
