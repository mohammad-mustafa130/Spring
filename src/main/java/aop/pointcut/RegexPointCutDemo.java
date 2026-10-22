package aop.pointcut;

import aop.common.AdviceRequired;
import aop.common.Guitarist;
import aop.common.SimpleAroundAdvice;
import org.springframework.aop.Advisor;
import org.springframework.aop.framework.ProxyFactory;
import org.springframework.aop.support.DefaultPointcutAdvisor;
import org.springframework.aop.support.JdkRegexpMethodPointcut;

public class RegexPointCutDemo {
    public static void main(String[] args) {
        Guitarist g = new Guitarist();
        var pc = new JdkRegexpMethodPointcut();
        pc.setPattern(".*sing.*");

        Advisor advisor = new DefaultPointcutAdvisor(pc, new SimpleAroundAdvice());

        ProxyFactory pf  = new ProxyFactory();
        pf.setTarget(g);
        pf.addAdvisor(advisor);

        Guitarist proxy = (Guitarist) pf.getProxy();
        proxy.sing();
        proxy.singasong();
        proxy.rest();
    }
}
