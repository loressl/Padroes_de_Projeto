package Factory_Method.Shape.classes;

import Factory_Method.Shape.interfaces.Shape;

public class Square implements Shape {

	@Override
	public void draw() {
		System.out.println("Inside Square::draw() method.");

	}

}
