package Observer.brizeno.subject;

import java.util.ArrayList;
import java.util.List;

import Observer.brizeno.classes.Dados;
import Observer.brizeno.interfaces.DadosObserver;

public class DadosSubject {
	
	public DadosSubject() {
		this.observers = new ArrayList<DadosObserver>();
	}
	
	public void attach(DadosObserver observer) {
		if(observer!=null)
			observers.add(observer);
	}
	
	public void detach(DadosObserver observer) {
		if(!observers.isEmpty() && observer!=null)
			observers.remove(observer);
	}
	
	public void setState(Dados dados) {
		this.dados=dados;
		notifyObservers();
	}
	
	private void notifyObservers() {
		for(DadosObserver observer: observers)
			observer.update();
	}
	
	public Dados getState() {
		return dados;
	}
	
	private List<DadosObserver> observers; 
	private Dados dados;
}
