package Factory_Method.ExProduct_slide.classes;

import Factory_Method.ExProduct_slide.creator.Creator;
import Factory_Method.ExProduct_slide.interfaces.Product;

public class ConcreteCreator extends Creator{

	@Override
	public Product factoryMethod() {
		return new ConcreteProduct();
	}

}
