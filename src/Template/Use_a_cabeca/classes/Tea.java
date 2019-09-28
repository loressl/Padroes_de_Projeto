package Template.Use_a_cabeca.classes;

import Template.Use_a_cabeca.template.CaffeineBeverage;

public class Tea extends CaffeineBeverage{
	
	@Override
	public void brew() {
		System.out.println("Steeping the tea");
	}
	
	@Override
	public void addCondiments() {
		System.out.println("Adding Lemon");
	}
	
}
