package aop.pointcut;

import aop.common.AdviceRequired;
import aop.common.AnnotedGuitarist;
import aop.common.Guitar;
import aop.common.SimpleAroundAdvice;
import org.springframework.aop.framework.ProxyFactory;
import org.springframework.aop.support.DefaultPointcutAdvisor;
import org.springframework.aop.support.annotation.AnnotationMatchingPointcut;

public class AnnotationPointcutDemo {
    public static void main(String[] args) {
        var johnMayer = new AnnotedGuitarist();
        var pc = AnnotationMatchingPointcut.forMethodAnnotation(AdviceRequired.class);

        var advisor = new DefaultPointcutAdvisor(pc, new SimpleAroundAdvice());

        ProxyFactory pf = new ProxyFactory();
        pf.setTarget(johnMayer);
        pf.addAdvisor(advisor);

        AnnotedGuitarist proxy = (AnnotedGuitarist) pf.getProxy();
        proxy.sing(new Guitar());
        proxy.rest();
    }
}
