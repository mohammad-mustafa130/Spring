package mypkg;
/*class SimpleMessageProviderTester {
	public static void main(String[] args) {
		MessageProvider mp = new SimpleMessageProvider();
		MessageRenderer mr = new StandardOutputMessageRenderer();

		mr.setMessageProvider(mp);
		mr.render();
	}
}*/
/*class SimpleMessageProviderTester {
	public static void main(String[] args) {
		MessageRenderer mr = MessageSupportFactory.getInstance().getMessageRenderer().orElseThrow(() -> new IllegalArgumentException("Exception occurred"));
		MessageProvider mp = MessageSupportFactory.getInstance().getMessageProvider().orElseThrow(() -> new IllegalArgumentException("Exception occurred"));
		mr.setMessageProvider(mp);
		mr.render();
	}
}*/
import java.util.ServiceLoader;
public class SimpleMessageProviderTester {
	public static void main(String[] args) {
		ServiceLoader<MessageRenderer> slr = ServiceLoader.load(MessageRenderer.class);
		ServiceLoader<MessageProvider> slp = ServiceLoader.load(MessageProvider.class);

		MessageRenderer mr = slr.findFirst().orElseThrow(() -> new IllegalArgumentException("Exception occurred"));
		MessageProvider mp = slp.findFirst().orElseThrow(() -> new IllegalArgumentException("Exception occurred"));
		mr.setMessageProvider(mp);
		mr.render();
	}
}
