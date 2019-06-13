package Factory_Method.Shape;

import Factory_Method.Shape.factory.ShapeFactory;
import Factory_Method.Shape.interfaces.IShapeFactory;
import Factory_Method.Shape.interfaces.Shape;

public class Simulation {

	public static void main(String[] args) {
		IShapeFactory shapeFactory = new ShapeFactory();
		
		Shape shape1= shapeFactory.getShape("CIRCLE");
		
		shape1.draw();
		
		Shape shape2= shapeFactory.getShape("RECTANGLE");

		shape2.draw();
		
		Shape shape3= shapeFactory.getShape("SQUARE");
		
		shape3.draw();
	}

}
