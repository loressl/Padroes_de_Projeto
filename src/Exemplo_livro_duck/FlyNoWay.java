package Exemplo_livro_duck;

import Exemplo_livro_duck.Interface.FlyBehavior;

public class FlyNoWay implements FlyBehavior{

	@Override
	public void fly() {
		System.out.println("I can't fly!");
	}

}
