package aop.pointcut;

import aop.common.GoodGuitarist;
import aop.common.GreatGuitarist;
import aop.common.SimpleAroundAdvice;
import aop.common.Singer;
import org.aopalliance.aop.Advice;
import org.springframework.aop.*;
import org.springframework.aop.framework.ProxyFactory;
import org.springframework.aop.support.*;

public class StaticPointcutDemo {
    public static void main(String[] args) {
        GoodGuitarist rdburmam = new GoodGuitarist();
        GreatGuitarist amaan = new GreatGuitarist();

        Singer proxyOne;
        Singer proxyTwo;

        Pointcut pc = new SimpleStaticPointcut();
        Advice advice = new SimpleAroundAdvice();
        Advisor advisor = new DefaultPointcutAdvisor(pc, advice);

        ProxyFactory pf = new ProxyFactory();
        pf.addAdvisor(advisor);
        pf.setTarget(rdburmam);

        proxyOne = (Singer) pf.getProxy();

        pf = new ProxyFactory();
        pf.addAdvisor(advisor);
        pf.setTarget(amaan);

        proxyTwo = (Singer) pf.getProxy();

        proxyOne.sing();
        proxyTwo.sing();
    }
}
