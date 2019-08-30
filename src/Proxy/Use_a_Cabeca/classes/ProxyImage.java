package Proxy.Use_a_Cabeca.classes;

import Proxy.Use_a_Cabeca.interfaces.Image;

public class ProxyImage implements Image{

	public ProxyImage(String fileName) {
		this.filename = fileName;
	}
	
	@Override
	public void display() {
		if(realImage == null)
			realImage = new RealImage(filename);
		realImage.display();
	}
	
	private RealImage realImage;
	private String filename;
}
