package Strategy.Use_a_cabeca_Livro.DUCK;

import Strategy.Use_a_cabeca_Livro.DUCK.comportamentos.FlyRocketPowered;

public class MiniDucksSimulator {
	
	public static void main(String[] args) {
		
		Duck mallard = new MallarDuck();
		mallard.performQuack();
		mallard.performFly();
		
		System.out.println();
		
		Duck model = new ModelDuck();
		//esse método está na pai e ele implementa uma interface q utiliza um método fly
		//esse fly esta na classe que foi instanciada no seu construtor
		model.performFly();
		model.setFlyBehavior(new FlyRocketPowered());
		model.performFly();
		//pag 42
	}
}
