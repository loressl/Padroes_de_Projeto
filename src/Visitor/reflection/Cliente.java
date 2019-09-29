package Visitor.reflection;

import Visitor.reflection.concret_elements.Ferrari;
import Visitor.reflection.concret_elements.Maserati;
import Visitor.reflection.interfaces.ICarElement;
import Visitor.reflection.object_structure.Cars;
import Visitor.reflection.visitors.ConcreteVisitor1;
import Visitor.reflection.visitors.ConcreteVisitor2;

//http://blog.intelly-net.com/java/design-pattern/design-pattern-visitor-with-java-reflection.html

public class Cliente {

	public static void main(String[] args) {
		Cars cars = new Cars();
		cars.attach((ICarElement)new Ferrari("green"));
		cars.attach((ICarElement)new Ferrari("yellow"));
		cars.attach((ICarElement)new Ferrari("white"));
		
		cars.attach((ICarElement)new Maserati("cyan"));
		cars.attach((ICarElement)new Maserati("black"));
		
		System.out.println("applied ConcreteVisitor1");
		ConcreteVisitor1 inc = new ConcreteVisitor1();
		
		cars.Accept(inc);
		System.out.println("-----------------------");
		System.out.println("applied ConcreteVisitor2");
		ConcreteVisitor2 inc2 = new ConcreteVisitor2();
		
		cars.Accept(inc2);
		
		
	}

}
