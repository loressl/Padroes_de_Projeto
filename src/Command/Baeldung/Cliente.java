package Command.Baeldung;

import Command.Baeldung.commands.OpenTextFileOperation;
import Command.Baeldung.commands.SaveTextFileOperation;
import Command.Baeldung.interfaces.TextFileOperation;
import Command.Baeldung.invoker.TextFileOperationExecutor;
import Command.Baeldung.receiver.TextFile;

//https://www.baeldung.com/java-command-pattern

public class Cliente {

	public static void main(String[] args) {
		TextFileOperation openTextFileOperation = new OpenTextFileOperation(new TextFile("file1.txt"));
        TextFileOperation saveTextFileOperation = new SaveTextFileOperation(new TextFile("file2.txt"));
        TextFileOperationExecutor textFileOperationExecutor = new TextFileOperationExecutor();
        System.out.println(textFileOperationExecutor.executeOperation(openTextFileOperation));
        System.out.println(textFileOperationExecutor.executeOperation(saveTextFileOperation));
	}

}
