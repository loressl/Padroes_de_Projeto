package Template.Use_a_cabeca.template;

public abstract class CaffeineBeverageWithHook {
	
	public final void prepareRecipe() {//algoritmo
		boilWater();//passos
		brew();
		pourInCup();
		if(customerWantsCondiments())
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
	
	//metodo hook, a subclasse pode alterar, mas n precisa fazê-lo
	public boolean customerWantsCondiments() {
		return true;
	}
}
