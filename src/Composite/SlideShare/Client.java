package Composite.SlideShare;

import Composite.SlideShare.composite.Foto;
import Composite.SlideShare.leafs.Linha;
import Composite.SlideShare.leafs.Retangulo;
import Composite.SlideShare.leafs.Texto;

public class Client {

	public static void main(String[] args) {
		Foto f = new Foto();
		Linha l = new Linha();
		Texto t = new Texto();
		Retangulo r = new Retangulo();
		
		f.adicionar(l);
		f.adicionar(r);
		f.adicionar(t);
		f.desenhar();

	}

}
