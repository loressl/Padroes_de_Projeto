package Composite.SlideShare.leafs;

import Composite.SlideShare.interfaces.Grafico;

public class Linha extends Grafico{
	
	public Linha() {}
	
	@Override
	public void desenhar() {
		System.out.println("Linha");
	}

}
