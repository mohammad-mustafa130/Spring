package aop.performance;

import org.springframework.aop.MethodBeforeAdvice;
import org.springframework.lang.NonNull;

import java.lang.reflect.Method;

public class NoOpBeforeAdvice implements MethodBeforeAdvice {
    @Override
    public void before(@NonNull Method method, Object[] args, Object target) throws Throwable {
    }
}
