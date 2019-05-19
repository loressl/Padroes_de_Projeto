package Decorator.Use_a_Cabeca;

public class DarkRoast extends Beverage{
	
	public DarkRoast() {
		this.description= "Most Excellent Dark Roast";
	}
	
	@Override
	public double cost() {
		return 0.99;
	}

}
