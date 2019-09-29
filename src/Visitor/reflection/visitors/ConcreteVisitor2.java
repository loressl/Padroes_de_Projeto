package Visitor.reflection.visitors;

import java.lang.reflect.Method;

import Visitor.reflection.concret_elements.Ferrari;
import Visitor.reflection.concret_elements.Maserati;
import Visitor.reflection.interfaces.Visitor;

public class ConcreteVisitor2 implements Visitor {

	@Override
	public void visit(Object o) {
		try {
			Method method = getClass().getMethod("visit", o.getClass());
			method.invoke(this, o);
		} catch (Exception e) {
			noMethod(o);
		}
	}

	public void noMethod(Object o) {
		System.out.println("no method");
	}
	
	public void visit(Maserati m) {
		m.setColour("blue");
		System.out.println("The colour of object Maserati is now blue");
	}
	
	public void visit(Ferrari f) {
		f.setColour("red2");
		System.out.println("The colour of object Ferrari is now red2");
	}

}
