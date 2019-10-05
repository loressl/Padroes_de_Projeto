package Observer.tutorialsPoint.interfaces;

import Observer.tutorialsPoint.subject.Subject;

public abstract class Observer {
	
	public abstract void update();
	protected Subject subject;
}
