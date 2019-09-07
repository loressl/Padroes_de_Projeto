package Composite.SlideShare.leafs;

import Composite.SlideShare.interfaces.Grafico;

public class Texto extends Grafico{
	
	public Texto() {}
	
	@Override
	public void desenhar() {
		System.out.println("Texto");
	}
}
