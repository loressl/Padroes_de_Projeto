package Prototype;

public class MachineImage implements Cloneable{
	
	StringBuilder image;
	
	public MachineImage(String os, String antivirusSW) {
		image = new StringBuilder();
		image.append(os).append(" + "+ antivirusSW);
	}
	
	private MachineImage(String sw) {
		image = new StringBuilder();
	}
	
	public void install(String sw) {
		image.append(sw);
	}
	
	public void printSw() {
		System.out.println(image);
	}
	
	@Override
	public MachineImage clone() {
		return new MachineImage(this.image.toString());
	}
}
