package Abstract_Factory_UDEMY.products;

public class KFCFoodMenu extends FoodMenu{

	public KFCFoodMenu(String menuStyle) {
		super(menuStyle);
	}

	@Override
	public void render() {
		System.out.println("KFC Style Menu");
		
	}
	
	
}
