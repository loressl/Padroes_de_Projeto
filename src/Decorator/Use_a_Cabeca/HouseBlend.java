package Decorator.Use_a_Cabeca;

public class HouseBlend extends Beverage{
	
	public HouseBlend() {
		this.description = "House Blend Coffee";
	}

	@Override
	public double cost() {
		return 0.89;
	}

}