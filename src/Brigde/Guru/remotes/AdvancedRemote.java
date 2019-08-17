package Brigde.Guru.remotes;

import Brigde.Guru.interfaces.Device;

public class AdvancedRemote extends BasicRemote{
	
	public AdvancedRemote(Device device) {
		super(device);
	}
	
	public void mute() {
		System.out.println("Remote: mute");
        device.setVolume(0);
	}
}
