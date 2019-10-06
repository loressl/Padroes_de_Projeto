package Command.DZone.commands;

import Command.DZone.interfaces.ICommand;
import Command.DZone.receiver.Light;

public class LightOnCommand implements ICommand{

	public LightOnCommand(Light light) {
		this.light = light;
	}
	
	@Override
	public void execute() {
		this.light.switchOn();
	}

	@Override
	public void undo() {
		this.light.switchOff();
	}
	
	private Light light;
}
