package Visitor.reflection.object_structure;

import java.util.ArrayList;
import java.util.List;

import Visitor.reflection.interfaces.ICarElement;
import Visitor.reflection.interfaces.Visitor;

public class Cars {
	
	public void attach(ICarElement c) {
		cars.add(c);
	}
	
	public void Accept(Visitor v) {
		for(ICarElement c: cars)
			c.accept(v);
	}
	
	private List<ICarElement> cars= new ArrayList<>();
}
