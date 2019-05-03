package Exemplo_livro_duck;

import Exemplo_livro_duck.Interface.FlyBehavior;

public class FlyWithWings implements FlyBehavior{

	@Override
	public void fly() {
		System.out.println("I'm flying!!");
	}
	

}
