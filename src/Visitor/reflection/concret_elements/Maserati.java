package Visitor.reflection.concret_elements;

import Visitor.reflection.interfaces.ICarElement;
import Visitor.reflection.interfaces.Visitor;

public class Maserati implements ICarElement{
	
	public Maserati(String colour) {
		super();
		this.colour = colour;
	}
	
	@Override
	public void accept(Visitor v) {
		// i must to call visit(Object o) so i need a cast of this
		//Object object = (Object) this;
		v.visit(this);
	}
	
	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	private String colour;

}
