package aop.common;

import org.aopalliance.intercept.*;
import org.slf4j.*;

public class SimpleAroundAdvice implements MethodInterceptor {
    private static final Logger logger = LoggerFactory.getLogger(SimpleAroundAdvice.class);

    @Override
    public Object invoke(MethodInvocation invocation) throws Throwable {
        logger.debug(">>Invoking " + invocation.getMethod().getName());

        Object returnValue = invocation.proceed();
        logger.debug(">>Done\n");

        return returnValue;
    }
}
