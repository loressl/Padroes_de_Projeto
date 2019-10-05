package Observer.thejavageek.subject;

import java.util.ArrayList;
import java.util.List;

import Observer.thejavageek.interfaces.Observable;
import Observer.thejavageek.interfaces.Observer;

public class Product implements Observable{

	@Override
	public void register(Observer o) {
		if(o!=null)
			this.observers.add(o);
	}

	@Override
	public void remove(Observer o) {
		if(o!=null && !observers.isEmpty())
			this.observers.remove(o);
	}

	@Override
	public void notifyObservers() {
		for(Observer o: observers)
			o.update(price);
	}
	
	//sempre que muda o estado de algo, todos os observers são notificados
	public void setPrice(double price) {
		this.price = price;
		this.notifyObservers();
	}



	private List<Observer> observers = new ArrayList<Observer>();
	private double price;

}
