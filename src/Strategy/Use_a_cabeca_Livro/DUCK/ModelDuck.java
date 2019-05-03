package Strategy.Use_a_cabeca_Livro.DUCK;

import Strategy.Use_a_cabeca_Livro.DUCK.comportamentos.FlyNoWay;
import Strategy.Use_a_cabeca_Livro.DUCK.comportamentos.Quack;

public class ModelDuck extends Duck{

	public ModelDuck() {
		flyBehavior = new FlyNoWay();
		quackBehavior = new Quack();
	}
	
	@Override
	public void display() {
		System.out.println("I'm a model duck");
		
	}

}
