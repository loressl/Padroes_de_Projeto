package Proxy.Use_a_Cabeca;

import Proxy.Use_a_Cabeca.classes.ProxyImage;
import Proxy.Use_a_Cabeca.interfaces.Image;

public class Cliente {

	public static void main(String[] args) {
		Image image = new ProxyImage("teste_10mb.jpg");
		
		//image will be loaded from disk
		image.display();
		System.out.println("");
		
		//image will not be loaded from disk
		image.display();
	}

}
