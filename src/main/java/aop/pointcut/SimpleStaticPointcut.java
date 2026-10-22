package aop.pointcut;

import aop.common.GreatGuitarist;
import org.springframework.aop.ClassFilter;
import org.springframework.aop.support.NameMatchMethodPointcut;
import org.springframework.lang.NonNull;
import java.lang.reflect.Method;

class SimpleStaticPointcut extends NameMatchMethodPointcut {
    @Override
    public boolean matches(Method method, @NonNull Class<?> cls) {
        return ("sing".equals(method.getName()));
    }
    @Override
    @NonNull
    public ClassFilter getClassFilter() {
        return cls -> (cls == GreatGuitarist.class);
    }
}
