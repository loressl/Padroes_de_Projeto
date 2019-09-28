package Template.Use_a_cabeca.template;

public abstract class CaffeineBeverage {
	
	public final void prepareRecipe() {//algoritmo
		boilWater();//passos
		brew();
		pourInCup();
		addCondiments();
	}
	
	public abstract void brew();
	public abstract void addCondiments();
	
	public void boilWater() {
		System.out.println("Boiling water");
	}
	
	public void pourInCup() {
		System.out.println("Pouring into cup");
	}
	
}
