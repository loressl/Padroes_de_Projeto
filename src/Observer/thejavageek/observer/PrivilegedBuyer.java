package Observer.thejavageek.observer;

import Observer.thejavageek.interfaces.Observable;
import Observer.thejavageek.interfaces.Observer;

public class PrivilegedBuyer implements Observer{

	public PrivilegedBuyer(Observable product) {
		this.product = product;
		this.product.register(this);
	}
	
	@Override
	public void update(double price) {
		System.out.println("New Price received in PrivilegedBuyer = " + price);
	}
	
	public void unSubscribe() {
		this.product.remove(this);
	}

	private Observable product;
}
