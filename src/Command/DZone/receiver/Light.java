package Command.DZone.receiver;

public class Light {
	
	public void switchOn() {
		on = true;
		System.out.println("ON");
	}
	
	public void switchOff() {
		on = false;
		System.out.println("OFF");
	}
	
	private boolean on;
}
