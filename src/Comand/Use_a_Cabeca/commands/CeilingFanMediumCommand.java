package Comand.Use_a_Cabeca.commands;

import Comand.Use_a_Cabeca.interfaces.Command;
import Comand.Use_a_Cabeca.receiver.CeilingFan;

public class CeilingFanMediumCommand implements Command {

	public CeilingFanMediumCommand(CeilingFan ceilingFan) {
		this.ceilingFan = ceilingFan;
	}

	@Override
	public void execute() {
		prevSpeed = ceilingFan.getSpeed();// precisa pegar antes, para saber como começou
		ceilingFan.medium();
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
