package Comand.Use_a_Cabeca.commands;

import Comand.Use_a_Cabeca.interfaces.Command;
import Comand.Use_a_Cabeca.receiver.Light;

public class LightOffCommand implements Command{

	public LightOffCommand(Light light) {
		this.light = light;
	}
	
	@Override
	public void execute() {
		light.off();
	}

	@Override
	public void undo() {
		light.on();
	}
	
	Light light;
}
