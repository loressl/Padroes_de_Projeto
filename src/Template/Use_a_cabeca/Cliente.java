package Template.Use_a_cabeca;

import Template.Use_a_cabeca.classes.CoffeeWithHook;
import Template.Use_a_cabeca.classes.Tea;

public class Cliente {

	public static void main(String[] args) {
		Tea myTea = new Tea();
		myTea.prepareRecipe();
		
		CoffeeWithHook cHook = new CoffeeWithHook();
		System.out.println("\nMaking coffee...");
		cHook.prepareRecipe();

	}

}
