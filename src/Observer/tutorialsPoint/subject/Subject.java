package Observer.tutorialsPoint.subject;

import java.util.ArrayList;
import java.util.List;

import Observer.tutorialsPoint.interfaces.Observer;

public class Subject {
	
	public int getState() {
		return state;
	}
	
	public void setState(int state) {
		this.state = state;
		notifyAllObservers();
	}
	
	public void attach(Observer observer) {
		observers.add(observer);
	}
	
	public void destach(Observer observer) {
		observers.remove(observer);
	}
	
	public void notifyAllObservers() {
		for(Observer observer: observers)
			observer.update();
	}
	
	private int state;
	private List<Observer> observers = new ArrayList<Observer>();
}
