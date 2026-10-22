package aop.pointcut;

import aop.common.GoodGuitarist;
import org.springframework.aop.ClassFilter;
import org.springframework.aop.support.DynamicMethodMatcherPointcut;
import java.lang.reflect.Method;
import org.slf4j.*;
import org.springframework.lang.NonNull;

class SimpleDynamicPointcut extends DynamicMethodMatcherPointcut {
    private static final Logger logger = LoggerFactory.getLogger(SimpleDynamicPointcut.class);
    @Override
    @NonNull
    public ClassFilter getClassFilter() {
        return cls -> (cls == GoodGuitarist.class);
    }
    @Override
    public boolean matches(Method method, @NonNull Class<?> cls) {
        return "sing".equals(method.getName());
    }

    @Override
    public boolean matches(Method method, @NonNull Class<?> targetClass, Object[] args) {
        logger.info("Dynamic check for " + method.getName());
        if (args.length == 0) {
            return false;
        }
        var key = (String) args[0];
        return key.equalsIgnoreCase("C");
    }
}


