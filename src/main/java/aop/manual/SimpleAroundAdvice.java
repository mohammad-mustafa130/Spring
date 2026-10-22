package aop.manual;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.lang.NonNull;
import org.springframework.util.StopWatch;

public class SimpleAroundAdvice implements MethodInterceptor {
    private static final Logger logger = LoggerFactory.getLogger(SimpleAroundAdvice.class);

    @Override
    public Object invoke(@NonNull MethodInvocation invocation) throws Throwable {
        logger.info("Around: starting timer");

        StopWatch sw = new StopWatch();
        sw.start(invocation.getMethod().getName());
        Object returnValue = invocation.proceed();
        sw.stop();

        logger.info("Around: concert duration = {}",sw.getTotalTimeMillis());

        return returnValue;
    }
}