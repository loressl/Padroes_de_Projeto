package Iterator.Use_a_cabeça;

import Iterator.Use_a_cabeça.classes.CafeMenu;
import Iterator.Use_a_cabeça.classes.DinerMenu;
import Iterator.Use_a_cabeça.classes.PancakeHouseMenu;
import Iterator.Use_a_cabeça.classes.Waitress;

public class Cliente {
	public static void main(String[] args) {
		PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
		DinerMenu dinerMenu = new DinerMenu();
		CafeMenu cafeMenu = new CafeMenu();
		
		Waitress waitress = new Waitress(pancakeHouseMenu, dinerMenu,cafeMenu);
		
		waitress.printMenu();
	}
}
