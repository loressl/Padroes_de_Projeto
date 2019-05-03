package Exemplo_livro_duck;

import Exemplo_livro_duck.Interface.QuackBehavior;

public class MuteQuack implements QuackBehavior{

	@Override
	public void quack() {
		System.out.println("<<Silence>>");
		
	}

}
