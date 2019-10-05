package Observer.tutorialsPoint;

import Observer.tutorialsPoint.observers.BinaryObserver;
import Observer.tutorialsPoint.observers.HexaObserver;
import Observer.tutorialsPoint.observers.OctalObserver;
import Observer.tutorialsPoint.subject.Subject;

public class ObserverPaternDemo {

	public static void main(String[] args) {
		Subject sub = new Subject();
		new HexaObserver(sub);
		new OctalObserver(sub);
		new BinaryObserver(sub);
		
		System.out.println("First state change:15");
		sub.setState(15);
		System.out.println("Second state change: 10");
		sub.setState(10);

	}

}
