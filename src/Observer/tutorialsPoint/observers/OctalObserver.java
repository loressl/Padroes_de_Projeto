package Observer.tutorialsPoint.observers;

import Observer.tutorialsPoint.interfaces.Observer;
import Observer.tutorialsPoint.subject.Subject;

public class OctalObserver extends Observer {

	public OctalObserver(Subject subject) {
		this.subject = subject;
		this.subject.attach(this);
	}

	@Override
	public void update() {
		System.out.println( "Octal String: " + Integer.toOctalString( subject.getState() ) );
	}

}
