package Brigde.Gof.shapes;

import Brigde.Gof.interfaces.Color;
import Brigde.Gof.interfaces.Shape;

public class Rectangle extends Shape{

	public Rectangle(Color color) {
		super(color);
	}

	@Override
	public void draw() {
		System.out.println("Draw Rectangle in ");
		color.applyColor();
	}

}
