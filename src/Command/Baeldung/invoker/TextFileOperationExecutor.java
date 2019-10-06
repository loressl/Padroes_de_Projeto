package Command.Baeldung.invoker;

import java.util.ArrayList;
import java.util.List;

import Command.Baeldung.interfaces.TextFileOperation;

public class TextFileOperationExecutor {
	
	public String executeOperation(TextFileOperation t) {
		textFileOperations.add(t);
		return t.execute();
	}
	
	private final List<TextFileOperation> textFileOperations = new ArrayList<TextFileOperation>();
}
