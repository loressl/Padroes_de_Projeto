package Adapter.Youtube;

public class Client {

	public static void main(String[] args) {
		ITarget target = new Adapter(new Adaptee());
		target.request();
	}

}
