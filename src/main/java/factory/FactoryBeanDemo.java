package factory;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.security.MessageDigest;

public class FactoryBeanDemo {
    public static void main(String[] args) {
        var ctx = new AnnotationConfigApplicationContext(MessageDigestConfig.class);
        MessageDigestFactoryBean factoryBean = (MessageDigestFactoryBean) ctx.getBean("&shaDigest");
        try {
            MessageDigest shaDigest = factoryBean.getObject();
            byte[] bt = shaDigest.digest("Lucknow".getBytes());
            for(int i = 0; i < bt.length; i++) {
                System.out.print(bt[i] + " ");
            }
            System.out.println();
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}
