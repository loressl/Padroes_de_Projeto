package Iterator.Use_a_cabeça.classes;

import java.util.Hashtable;
import java.util.Iterator;

import Iterator.Use_a_cabeça.interfaces.Menu;

public class CafeMenu implements Menu{
	
	public CafeMenu() {
		addItem("Veggie Burger and Air Fries", 
				"Veggie burger on a whole wheat bun, lettuce, tomato, and fries"
				, true, 3.99);
	}
	
	public void addItem(String name, String description, boolean vegetarian, double price) {
		MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
		menuItems.put(menuItem.getName(), menuItem);
	}
	

	@Override
	public Iterator createIterator() {
		return menuItems.values().iterator();
	}
	
	private Hashtable<String, MenuItem> menuItems = new Hashtable<>();
}
