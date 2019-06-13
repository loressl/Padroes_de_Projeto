package Factory_Method.Shape.factory;

import Factory_Method.Shape.classes.Circle;
import Factory_Method.Shape.classes.Rectangle;
import Factory_Method.Shape.classes.Square;
import Factory_Method.Shape.interfaces.IShapeFactory;
import Factory_Method.Shape.interfaces.Shape;

public class ShapeFactory implements IShapeFactory{
	
	@Override
	public Shape getShape(String shapetype) {
		if(shapetype == null)
			return null;
		if(shapetype.equalsIgnoreCase("CIRCLE"))
			return new Circle();
		else if(shapetype.equalsIgnoreCase("RECTANGLE"))
			return new Rectangle();
		else if(shapetype.equalsIgnoreCase("SQUARE"))
			return new Square();
		
		return null;
	}
}
