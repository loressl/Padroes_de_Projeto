package Factory_Method.ExProduct_slide.classes;

import Factory_Method.ExProduct_slide.interfaces.Product;

public class ConcreteProduct implements Product{

	@Override
	public void message() {
		System.out.println("Concret produto criado");
	}

}
