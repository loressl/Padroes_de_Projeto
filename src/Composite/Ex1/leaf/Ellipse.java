package Composite.Ex1.leaf;

import Composite.Ex1.component.Graphic;

public class Ellipse implements Graphic {

	@Override
	public void print() {
		System.out.println("Ellipse");
	}

}
