package Strategy.Use_a_cabeca_Livro.DUCK;

import Strategy.Use_a_cabeca_Livro.DUCK.comportamentos.FlyWithWings;
import Strategy.Use_a_cabeca_Livro.DUCK.comportamentos.Quack;

public class MallarDuck extends Duck{

	public MallarDuck() {
		quackBehavior = new Quack();
		flyBehavior = new FlyWithWings();
	}
	
	@Override
	public void display() {
		System.out.println("I'm a real Mallard duck");
		
	}

}
