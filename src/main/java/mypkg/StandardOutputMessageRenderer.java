package mypkg;
import static java.lang.System.*;
public class StandardOutputMessageRenderer implements MessageRenderer {
	private MessageProvider messageProvider;

	public StandardOutputMessageRenderer() {
		out.println("Constructor called");
	}
	@Override
	public void render() {
		if(messageProvider == null) {
			throw new RuntimeException("Exception Occurred");
		}
		out.println(messageProvider.getMessage());
	}
	@Override
	public void setMessageProvider(MessageProvider messageProvider) {
		this.messageProvider = messageProvider;
	}
	@Override
	public MessageProvider getMessageProvider() {
		return messageProvider;
	}
}
