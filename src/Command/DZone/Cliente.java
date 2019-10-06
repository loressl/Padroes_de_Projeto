package Command.DZone;

import Command.DZone.commands.LightOffCommand;
import Command.DZone.commands.LightOnCommand;
import Command.DZone.interfaces.ICommand;
import Command.DZone.invoker.RemoteControl;
import Command.DZone.receiver.Light;

public class Cliente {

	public static void main(String[] args) {
	    RemoteControl control = new RemoteControl();

	    Light light = new Light();

	    ICommand lightsOn = new LightOnCommand(light);

	    ICommand lightsOff = new LightOffCommand(light);

	    //switch on
	    control.setCommand(lightsOn);
	    control.pressButton();
	    control.pressUndo();

	    //switch off
	    control.setCommand(lightsOff);
	    control.pressButton();
	    control.pressUndo();
	}

}
