package Iterator.Use_a_cabeça.classes;

import java.util.Iterator;

import Iterator.Use_a_cabeça.interfaces.Menu;

public class Waitress {
	
	public Waitress(Menu pancakeHouseMenu, Menu dinerMenu,Menu cafeMenu) {
		this.pancakeHouseMenu = pancakeHouseMenu;
		this.dinerMenu = dinerMenu;
		this.cafeMenu = cafeMenu;
	}
	
	public void printMenu() {
		Iterator pancakeIterator = pancakeHouseMenu.createIterator();
		Iterator dinerItertor = dinerMenu.createIterator();
		Iterator cafeIterator = cafeMenu.createIterator();
		System.out.println("Menu\n ---\nBreakfast");
		printMenu(pancakeIterator);
		System.out.println("\nLunch");
		printMenu(dinerItertor);
		System.out.println("\nDinner");
		printMenu(cafeIterator);
	}
	
	private void printMenu(Iterator iterator) {
		while(iterator.hasNext()) {
			MenuItem menuItem = (MenuItem)iterator.next();
			System.out.print(menuItem.getName() + ", ");
			System.out.print(menuItem.getPrice() + " -- ");
			System.out.println(menuItem.getDescription());
		}
	}
	
	private Menu pancakeHouseMenu;
	private Menu dinerMenu;
	private Menu cafeMenu;
}
