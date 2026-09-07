package mypkg;
import java.util.*;
public class MessageSupportFactory {
    private final static MessageSupportFactory instance;
    private MessageRenderer renderer;
    private MessageProvider provider;
    private MessageSupportFactory() {
        Properties props = new Properties();
        try {
            props.load(this.getClass().getResourceAsStream("/myproperties.properties"));
            String rendererClass = props.getProperty("renderer.class");
            String providerClass = props.getProperty("provider.class");
            renderer = (MessageRenderer) Class.forName(rendererClass).getDeclaredConstructor().newInstance();
            provider = (MessageProvider) Class.forName(providerClass).getDeclaredConstructor().newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    static {
        instance = new MessageSupportFactory();
    }
    public static MessageSupportFactory getInstance() {
        return instance;
    }
    public Optional<MessageRenderer> getMessageRenderer() {
        return renderer != null ? Optional.of(renderer) : Optional.empty();
    }
    public Optional<MessageProvider> getMessageProvider() {
        return provider != null ? Optional.of(provider) : Optional.empty();
    }
}
