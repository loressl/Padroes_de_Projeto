package Iterator.Use_a_cabeça.classes;

import java.util.Iterator;

import Iterator.Use_a_cabeça.classes_iterator.DinerMenuIterator;
import Iterator.Use_a_cabeça.interfaces.Menu;

public class DinerMenu implements Menu{
	
	public DinerMenu() {
		menuItems = new MenuItem[MAX_ITEMS];
		addItem("Hotdog", "A hot dog, with saurkraut, reliah, onions, topped with cheese", false, 3.05);
		addItem("BLT", "Bacon with lettuce & tomato com whole wheat", false, 2.99);
	}
	
	public void addItem(String name, String description, boolean vegetarian, double price) {
		MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
		if(numberOfItems >= MAX_ITEMS)
			System.err.println("Sorry, menu is full! Can't add item to menu");
		else {
			menuItems[numberOfItems] = menuItem;
			numberOfItems++;
		}
	}
	
	public Iterator createIterator() {
		return new DinerMenuIterator(menuItems);
	}
	
	
	private static final int MAX_ITEMS= 6;
	private int numberOfItems = 0;
	MenuItem[] menuItems;
}
