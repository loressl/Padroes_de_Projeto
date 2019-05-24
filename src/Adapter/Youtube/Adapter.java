package Adapter.Youtube;

public class Adapter implements ITarget{
	
	private Adaptee adaptee;
	
	public Adapter(Adaptee a) {
		this.adaptee = a;
	}
	
	@Override
	public void request() {
		this.adaptee.specificRequest();
	}

}
