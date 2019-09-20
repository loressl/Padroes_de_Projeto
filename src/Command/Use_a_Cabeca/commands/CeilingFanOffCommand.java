package Command.Use_a_Cabeca.commands;

import Command.Use_a_Cabeca.interfaces.Command;
import Command.Use_a_Cabeca.receiver.CeilingFan;

public class CeilingFanOffCommand implements Command {

	public CeilingFanOffCommand(CeilingFan ceilingFan) {
		this.ceilingFan = ceilingFan;
	}
	
	@Override
	public void execute() {
		prevSpeed= ceilingFan.getSpeed();//precisa pegar antes, para saber como começou
		ceilingFan.off();
	}

	@Override
	public void undo() {
		if (prevSpeed == CeilingFan.HIGH)
			ceilingFan.high();
		else if (prevSpeed == CeilingFan.MEDIUM)
			ceilingFan.medium();
		else if (prevSpeed == CeilingFan.LOW)
			ceilingFan.low();
		else if (prevSpeed == CeilingFan.OFF)
			ceilingFan.off();
	}

	CeilingFan ceilingFan;
	int prevSpeed;
}
