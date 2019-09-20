package Command.Use_a_Cabeca;

import Command.Use_a_Cabeca.commands.CeilingFanHighCommand;
import Command.Use_a_Cabeca.commands.CeilingFanMediumCommand;
import Command.Use_a_Cabeca.commands.CeilingFanOffCommand;
import Command.Use_a_Cabeca.commands.LightOffCommand;
import Command.Use_a_Cabeca.commands.LightOnCommand;
import Command.Use_a_Cabeca.invocador.RemoteControl;
import Command.Use_a_Cabeca.receiver.CeilingFan;
import Command.Use_a_Cabeca.receiver.Light;

public class Cliente {

	public static void main(String[] args) {
		//testarComandosLuz();
		testarComandosVentilador();
	}

	public static void testarComandosLuz() {
		System.out.println("\n---------------Comandos de luz-----------\n");
		RemoteControl remoteControl = new RemoteControl();

		Light livingRoomLight = new Light();
		LightOnCommand lightOnCommand = new LightOnCommand(livingRoomLight);
		LightOffCommand lightOffCommand = new LightOffCommand(livingRoomLight);

		remoteControl.setCommand(0, lightOnCommand, lightOffCommand);

		remoteControl.onButtonWasPushed(0);
		remoteControl.offButtonWasPushed(0);
		System.out.println(remoteControl);
		remoteControl.undoButtonWasPushed();
		remoteControl.offButtonWasPushed(0);
		remoteControl.onButtonWasPushed(0);
		System.out.println(remoteControl);
		remoteControl.undoButtonWasPushed();
	}
	
	public static void testarComandosVentilador() {
		System.out.println("\n---------------Controle ventilador-----------\n");
		RemoteControl remoteControl = new RemoteControl();
		
		CeilingFan ceilingFan = new CeilingFan("Living Room");
		
		CeilingFanMediumCommand ceilingFanMediumCommand = new CeilingFanMediumCommand(ceilingFan);
		CeilingFanHighCommand ceilingFanHighCommand = new CeilingFanHighCommand(ceilingFan);
		CeilingFanOffCommand ceilingFanOffCommand = new CeilingFanOffCommand(ceilingFan);
		
		remoteControl.setCommand(0, ceilingFanMediumCommand, ceilingFanOffCommand);
		remoteControl.setCommand(1, ceilingFanHighCommand, ceilingFanOffCommand);
		
		remoteControl.onButtonWasPushed(0);
		remoteControl.offButtonWasPushed(0);
		System.out.println(remoteControl);
		remoteControl.undoButtonWasPushed();
		
		remoteControl.onButtonWasPushed(1);
		System.out.println(remoteControl);
		remoteControl.undoButtonWasPushed();
	}

}
