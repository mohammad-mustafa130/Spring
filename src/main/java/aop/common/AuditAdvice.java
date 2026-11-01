package aop.common;

import org.aspectj.lang.JoinPoint;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.aop.MethodBeforeAdvice;
import org.springframework.lang.NonNull;

import java.lang.reflect.Method;

public class AuditAdvice implements MethodBeforeAdvice {
    private static final Logger logger = LoggerFactory.getLogger(AuditAdvice.class);

    @Override
    public void before(@NonNull Method method, Object[] args, Object target) throws Throwable {
        logger.info("Executing {}", method);
    }


}
