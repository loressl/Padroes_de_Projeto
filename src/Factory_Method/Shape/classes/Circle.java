package Factory_Method.Shape.classes;

import Factory_Method.Shape.interfaces.Shape;

public class Circle implements Shape {

	@Override
	public void draw() {
		System.out.println("Inside Circle::draw() method.");

	}

}
