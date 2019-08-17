package Brigde.Gof.shapes;

import Brigde.Gof.interfaces.Color;
import Brigde.Gof.interfaces.Shape;

public class Circle extends Shape{

	public Circle(Color color) {
		super(color);
	}

	@Override
	public void draw() {
		System.out.println("Draw Circle in ");
		color.applyColor();
	}

}
