package Iterator.Use_a_cabeça.classes;

import java.util.ArrayList;
import java.util.Iterator;

import Iterator.Use_a_cabeça.interfaces.Menu;

public class PancakeHouseMenu implements Menu{
	
	public PancakeHouseMenu() {
		this.menuItems = new ArrayList<>();
		addItem("Blueberry", "Pancakes made with fresh bluberries", true, 3.49);
		addItem("Waffles", "Waffles with your choice of blueberries or strawberries", true, 3.59);
	}
	
	public void addItem(String name, String description, boolean vegetarian, double price) {
		MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
		menuItems.add(menuItem);
	}
	
	public Iterator createIterator() {
		return menuItems.iterator();
	}
	
	private ArrayList<MenuItem> menuItems;
}
