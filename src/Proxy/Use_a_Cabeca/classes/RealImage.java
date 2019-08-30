package Proxy.Use_a_Cabeca.classes;

import Proxy.Use_a_Cabeca.interfaces.Image;

public class RealImage implements Image{

	public RealImage(String fileName) {
		this.fileName = fileName;
		loadFromDisk(fileName);
	}
	
	@Override
	public void display() {
		System.out.println("Displaying "+ fileName);
	}
	
	private void loadFromDisk(String fileName) {
		System.out.println("Loading " + fileName);
	}
	
	private String fileName;

}
