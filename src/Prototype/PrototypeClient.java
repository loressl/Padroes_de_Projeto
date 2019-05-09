package Prototype;

public class PrototypeClient {

	public static void main(String[] args) {
		
		//Create base machine images
		MachineImage linuxVM = new MachineImage("Linux", "Symantec");
		MachineImage windowsVM = new MachineImage("Windows", "MaAfee");
		
		
		//Clone Linux VM and install Web Server
		MachineImage webServer = linuxVM.clone();
		webServer.install(" + WEB Server S/W");
		
		

	}

}
