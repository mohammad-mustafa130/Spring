package aop.manual;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.aop.AfterReturningAdvice;
import org.springframework.lang.NonNull;

import java.lang.reflect.Method;

public class SimpleAfterAdvice implements AfterReturningAdvice {
    private static final Logger logger = LoggerFactory.getLogger(SimpleAfterAdvice.class);

    @Override
    public void afterReturning(Object returnValue, @NonNull Method method, @NonNull Object[] args, Object target) throws Throwable {
        logger.info("After: offer standing ovation");
    }
}
