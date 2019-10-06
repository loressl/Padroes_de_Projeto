package Command.Baeldung.commands;

import Command.Baeldung.interfaces.TextFileOperation;
import Command.Baeldung.receiver.TextFile;

public class SaveTextFileOperation implements TextFileOperation{

	public SaveTextFileOperation(TextFile textFile) {
		this.textFile=textFile;
	}
	
	@Override
	public String execute() {
		return textFile.save();
	}
	
	private TextFile textFile;

}
