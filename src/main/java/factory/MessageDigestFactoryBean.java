package factory;

import org.springframework.beans.factory.FactoryBean;
import org.springframework.beans.factory.InitializingBean;

import java.security.MessageDigest;

public class MessageDigestFactoryBean implements FactoryBean<MessageDigest>, InitializingBean {
    private MessageDigest messageDigest = null;
    private String algorithmName = "MD5";
    @Override
    public MessageDigest getObject() throws Exception {
        return messageDigest;
    }
    @Override
    public Class<MessageDigest> getObjectType() {
        return MessageDigest.class;
    }
    @Override
    public boolean isSingleton() {
        return true;
    }
    public void setAlgorithmName(String algorithmName) {
        this.algorithmName = algorithmName;
    }
    @Override
    public void afterPropertiesSet() throws Exception {
        messageDigest = MessageDigest.getInstance(algorithmName);
    }
}
