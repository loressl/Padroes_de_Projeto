package Brigde.Gof.shapes;

import Brigde.Gof.interfaces.Color;
import Brigde.Gof.interfaces.Shape;

public class Square extends Shape{

	public Square(Color color) {
		super(color);
	}

	@Override
	public void draw() {
		System.out.println("Draw Square in ");
		color.applyColor();
	}

}
