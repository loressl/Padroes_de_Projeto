package Command.DZone.invoker;

import Command.DZone.interfaces.ICommand;

public class RemoteControl {

	public void setCommand(ICommand command) {
		this.command = command;
	}
	
	public void pressButton() {
		this.command.execute();
	}

	public void pressUndo() {
		this.command.undo();
	}
	
	private ICommand command;
}
