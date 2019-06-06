package Abstracty_Factory.Udemy.products;

public class KFCFurniture extends Furniture{

	public KFCFurniture(String waterMark) {
		super(waterMark);
	}

	@Override
	public void use() {
		System.out.println("KFC Style Furniture");
		
	}

}
