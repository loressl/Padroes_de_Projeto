package Command.Baeldung.receiver;

public class TextFile {
	
	public TextFile(String name) {
		this.name=name;
	}
	
	public String open() {
		return "Opening file "+ name;
	}
	
	public String save() {
		return "Saving file "+ name;
	}
	
	private String name;
}
