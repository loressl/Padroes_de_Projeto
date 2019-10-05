package Observer.brizeno.interfaces;

import Observer.brizeno.subject.DadosSubject;

public abstract class DadosObserver {
	
	public DadosObserver(DadosSubject subject) {
		this.subject = subject;
	}
	
	public abstract void update();
	
	protected DadosSubject subject;
}
