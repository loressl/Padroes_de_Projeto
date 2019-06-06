package Abstracty_Factory.Udemy.products;

public class DominosFurniture extends Furniture{

	public DominosFurniture(String waterMark) {
		super(waterMark);
	}

	@Override
	public void use() {
		System.out.println("Dominos Style Furniture");
		
	}

}
