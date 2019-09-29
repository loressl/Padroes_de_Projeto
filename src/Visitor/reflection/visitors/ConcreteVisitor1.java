package Visitor.reflection.visitors;

import java.lang.reflect.Method;

import Visitor.reflection.concret_elements.Ferrari;
import Visitor.reflection.interfaces.Visitor;

public class ConcreteVisitor1 implements Visitor{

	@Override
	public void visit(Object o) {
		try {
			//pega o metodo visit que recebe o objeto q passsa no parametro
			Method method = getClass().getMethod("visit", o.getClass());
			method.invoke(this, o);//invoca o metodo
		} catch (Exception e) {
			noMethod(o);//caso n tenha o metodo q receba tal objeto
		}
	}
	
	public void visit(Ferrari f) {
		f.setColour("red");
		System.out.println("The colour of object Ferrari is now red");
	}
	
	public void noMethod(Object o) {
		System.out.println("no method");
	}

}
