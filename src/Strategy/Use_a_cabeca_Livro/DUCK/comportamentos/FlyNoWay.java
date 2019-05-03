package Strategy.Use_a_cabeca_Livro.DUCK.comportamentos;

import Strategy.Use_a_cabeca_Livro.DUCK.Interface.FlyBehavior;

public class FlyNoWay implements FlyBehavior{

	@Override
	public void fly() {
		System.out.println("I can't fly!");
	}

}
