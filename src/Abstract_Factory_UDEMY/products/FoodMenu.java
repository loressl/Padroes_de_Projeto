package Abstract_Factory_UDEMY.products;

public abstract class FoodMenu {

	private String menuStyle;
	
	public FoodMenu(String menuStyle) {
		this.menuStyle = menuStyle;
	}

	public String getMenuStyle() {
		return menuStyle;
	}

	public void setMenuStyle(String menuStyle) {
		this.menuStyle = menuStyle;
	}
	
	public abstract void render();
}
