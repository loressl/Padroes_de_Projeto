package Exemplo_livro_duck;

import Exemplo_livro_duck.Interface.QuackBehavior;

public class Squeak implements QuackBehavior{

	@Override
	public void quack() {
		System.out.println("Squeak");
		
	}

}
