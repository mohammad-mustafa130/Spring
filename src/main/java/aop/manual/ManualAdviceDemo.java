package aop.manual;

import org.springframework.aop.framework.ProxyFactory;

public class ManualAdviceDemo {
    public static void main(String[] args) {
        Concert concert = new Concert();

        ProxyFactory pf = new ProxyFactory();
        pf.addAdvice(new SimpleBeforeAdvice());
        pf.addAdvice(new SimpleAroundAdvice());
        pf.addAdvice(new SimpleAfterAdvice());
        pf.setTarget(concert);

        Performance proxy = (Performance) pf.getProxy();
        proxy.execute();
    }
}