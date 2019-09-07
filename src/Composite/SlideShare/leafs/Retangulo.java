package Composite.SlideShare.leafs;

import Composite.SlideShare.interfaces.Grafico;

public class Retangulo extends Grafico{
	
	public Retangulo() {}
	
	@Override
	public void desenhar() {
		System.out.println("Retângulo");
	}
}
