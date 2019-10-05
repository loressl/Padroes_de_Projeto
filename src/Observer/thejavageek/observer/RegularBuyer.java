package Observer.thejavageek.observer;

import Observer.thejavageek.interfaces.Observable;
import Observer.thejavageek.interfaces.Observer;

public class RegularBuyer implements Observer{

	public RegularBuyer(Observable product) {
		this.product = product;
		this.product.register(this);
	}
	
	@Override
	public void update(double price) {
		System.out.println("New price received in RegularBuyer = " + price);
	}
	
	public void unSubscribe() {
		this.product.remove(this);
	}
	
	private Observable product;

}
