package Brigde.Gof;

import java.util.ArrayList;
import java.util.List;

import Brigde.Gof.colors.Green;
import Brigde.Gof.colors.Red;
import Brigde.Gof.interfaces.Shape;
import Brigde.Gof.shapes.Circle;
import Brigde.Gof.shapes.Rectangle;
import Brigde.Gof.shapes.Square;

public class Cliente {

	public static void main(String[] args) {
		List<Shape> shapes = new ArrayList<>();
		shapes.add(new Circle(new Red()));
		shapes.add(new Square(new Red()));
		shapes.add(new Rectangle(new Green()));
		
		for(Shape s: shapes)
			s.draw();
	}

}
