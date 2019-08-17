package Brigde.Guru;

import Brigde.Guru.devices.Radio;
import Brigde.Guru.devices.Tv;
import Brigde.Guru.interfaces.Device;
import Brigde.Guru.remotes.AdvancedRemote;
import Brigde.Guru.remotes.BasicRemote;

public class Cliente {

	public static void main(String[] args) {
		testDevice(new Tv());
        testDevice(new Radio());
	}
	
	public static void testDevice(Device device) {
        System.out.println("Tests with basic remote.");
        BasicRemote basicRemote = new BasicRemote(device);
        basicRemote.power();
        device.printStatus();

        System.out.println("Tests with advanced remote.");
        AdvancedRemote advancedRemote = new AdvancedRemote(device);
        advancedRemote.power();
        advancedRemote.mute();
        device.printStatus();
    }

}
