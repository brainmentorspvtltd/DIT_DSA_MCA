import java.util.ResourceBundle;

public class MessageReader {
	ResourceBundle rb;
	public MessageReader() {
		rb = ResourceBundle.getBundle("messages");
	}
	
	public String getMessages(String key) {
		return rb.getString(key);
	}
}
