package Strategy.Use_a_cabeca_Livro.DUCK.comportamentos;

import Strategy.Use_a_cabeca_Livro.DUCK.Interface.QuackBehavior;

public class Squeak implements QuackBehavior{

	@Override
	public void quack() {
		System.out.println("Squeak");
		
	}

}
