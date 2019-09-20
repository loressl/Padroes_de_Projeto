package Command.TutorialsPoint.receiver;

public class Stock {
	
	public void buy() {
		System.out.println("Stock [Name: " + name + " ,"
				+ "Quantity: "+ quantity + " ] bought");
	}
	
	public void sell() {
		System.out.println("Stock [ Name: "+name+", "
		        + "Quantity: " + quantity +" ] sold");
	}

	private String name = "ABC";
	private int quantity = 10;
}
