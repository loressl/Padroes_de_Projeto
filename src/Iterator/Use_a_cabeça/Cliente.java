package Iterator.Use_a_cabe�a;

import Iterator.Use_a_cabe�a.classes.CafeMenu;
import Iterator.Use_a_cabe�a.classes.DinerMenu;
import Iterator.Use_a_cabe�a.classes.PancakeHouseMenu;
import Iterator.Use_a_cabe�a.classes.Waitress;

public class Cliente {
	public static void main(String[] args) {
		PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
		DinerMenu dinerMenu = new DinerMenu();
		CafeMenu cafeMenu = new CafeMenu();
		
		Waitress waitress = new Waitress(pancakeHouseMenu, dinerMenu,cafeMenu);
		
		waitress.printMenu();
	}
}
