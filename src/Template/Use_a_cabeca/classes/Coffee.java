package Template.Use_a_cabeca.classes;

import Template.Use_a_cabeca.template.CaffeineBeverage;

public class Coffee extends CaffeineBeverage{
	
	@Override
	public void brew() {
		System.out.println("Dripping Coffee through filter");
	}
	
	@Override
	public void addCondiments() {
		System.out.println("Adding Sugar and Milk");
	}
	
}
