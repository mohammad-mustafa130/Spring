package aop.pointcut;

import aop.common.*;
import org.springframework.aop.framework.ProxyFactory;
import org.springframework.aop.support.NameMatchMethodPointcutAdvisor;

public class NameMatchMethodAdvisorDemo {
    public static void main(String[] args) {
        GrammyGuitarist gg = new GrammyGuitarist();

        NameMatchMethodPointcutAdvisor  advisor = new NameMatchMethodPointcutAdvisor(new SimpleAroundAdvice());
        advisor.setMappedNames("sing", "rest");

        ProxyFactory pf = new ProxyFactory();
        pf.setTarget(gg);
        pf.addAdvisor(advisor);

        GrammyGuitarist proxy = (GrammyGuitarist) pf.getProxy();
        proxy.sing();
        proxy.sing(new Guitar());
        proxy.rest();
        proxy.talk();
    }
}
