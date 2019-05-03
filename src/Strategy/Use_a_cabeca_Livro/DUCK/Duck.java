package Strategy.Use_a_cabeca_Livro.DUCK;

import Strategy.Use_a_cabeca_Livro.DUCK.Interface.FlyBehavior;
import Strategy.Use_a_cabeca_Livro.DUCK.Interface.QuackBehavior;

public abstract class Duck {
	//o tipo da variável tem q ser um supertipo que pode ser uma clase ou interface/abstrata
	//isso é polimorfismo, e o que for chamar, onde estiver implementado o método, vai lá
	FlyBehavior flyBehavior;
	QuackBehavior quackBehavior;
	
	public Duck(){}
	
	public abstract void display();
	
	public void performFly() {
		flyBehavior.fly();
	}
	
	public void performQuack() {
		quackBehavior.quack();
	}
	
	//para trabalhar de forma dinâmica, pois podem ser chamados a hora q quiser
	public void setFlyBehavior(FlyBehavior fb) {
		this.flyBehavior = fb;
	}
	
	public void setQuackBehavior(QuackBehavior qb) {
		this.quackBehavior = qb;
	}
	
	public void swim() {
		System.out.println("All ducks float, even decoys!");
	}
}
