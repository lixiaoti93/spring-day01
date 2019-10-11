package basic;

public class MessageService {

	public MessageService() {
		System.out.println("MessageService的无参构造器 ");
	}
	public void init() {
		System.out.println("MessageService的init方法");
	}
	public void sendMessage() {
		System.out.println("MessageService的sendMessage方法");
	}
	public void destroy() {
		System.out.println("MessageService的destroy方法");
	}

}
