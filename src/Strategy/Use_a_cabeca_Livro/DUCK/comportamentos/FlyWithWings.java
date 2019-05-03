package Strategy.Use_a_cabeca_Livro.DUCK.comportamentos;

import Strategy.Use_a_cabeca_Livro.DUCK.Interface.FlyBehavior;

public class FlyWithWings implements FlyBehavior{

	@Override
	public void fly() {
		System.out.println("I'm flying!!");
	}
	

}
