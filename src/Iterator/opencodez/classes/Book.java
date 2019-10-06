package Iterator.opencodez.classes;

public class Book {

	public Book(String name, String publication) {
		super();
		this.name = name;
		this.publication = publication;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getPublication() {
		return publication;
	}
	
	public void setPublication(String publication) {
		this.publication = publication;
	}
	
	private String name;
	private String publication;
}
