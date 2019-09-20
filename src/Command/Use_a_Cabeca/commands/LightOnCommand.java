package Command.Use_a_Cabeca.commands;

import Command.Use_a_Cabeca.interfaces.Command;
import Command.Use_a_Cabeca.receiver.Light;

public class LightOnCommand implements Command{

	public LightOnCommand(Light light) {
		this.light = light;
	}
	
	@Override
	public void execute() {
		light.on();
	}

	@Override
	public void undo() {
		light.off();
	}

	Light light;
}
