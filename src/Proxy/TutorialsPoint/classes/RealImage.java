package Proxy.TutorialsPoint.classes;

import Proxy.TutorialsPoint.interfaces.Image;

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
