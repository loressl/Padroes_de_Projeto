package Command.Baeldung.commands;

import Command.Baeldung.interfaces.TextFileOperation;
import Command.Baeldung.receiver.TextFile;

public class OpenTextFileOperation implements TextFileOperation{

	public OpenTextFileOperation(TextFile textFile) {
		this.textFile=textFile;
	}
	
	@Override
	public String execute() {
		return textFile.open();
	}
	
	private TextFile textFile;

}
