package Template.Use_a_cabeca.classes;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import Template.Use_a_cabeca.template.CaffeineBeverageWithHook;

public class CoffeeWithHook extends CaffeineBeverageWithHook{

	@Override
	public void brew() {
		System.out.println("Dripping coffee through filter");
	}

	@Override
	public void addCondiments() {
		System.out.println("Adding Sugar and Milk");
	}
	
	public boolean customerWantsCondiments() {
		String answer = getUserInput();
		if(answer.toLowerCase().startsWith("y"))
			return true;
		return false;
	}
	
	private String getUserInput() {
		String answer = null;
		System.out.println("Would you like milk and sugar with yout coffee (y/n)? ");
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		try {
			answer = in.readLine();
		} catch (Exception e) {
			System.err.println("IO error trying to read your anyswer");
		}
		if(answer==null)
			return "no";
		return answer;
	}
}
