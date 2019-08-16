package Composite.Use_a_cabeca.composite;

import java.util.ArrayList;
import java.util.List;

import Composite.Use_a_cabeca.component.Graphic;

public class CompositeGraphic implements Graphic {

	
	@Override
	public void print() {
		for(Graphic graphic : childGraphics)
			graphic.print();
	}
	
	public void add(Graphic graphic) {
		childGraphics.add(graphic);
	}
	
	public void remove(Graphic graphic) {
		childGraphics.remove(graphic);
	}
	
	private List<Graphic> childGraphics = new ArrayList<Graphic>();
}
