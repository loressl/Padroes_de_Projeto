package Command.DZone.commands;

import Command.DZone.interfaces.ICommand;
import Command.DZone.receiver.Light;

public class LightOffCommand implements ICommand{

	public LightOffCommand(Light light) {
		this.light = light;
	}
	
	@Override
	public void execute() {
		this.light.switchOff();
	}

	@Override
	public void undo() {
		this.light.switchOn();
	}
	
	private Light light;

}
