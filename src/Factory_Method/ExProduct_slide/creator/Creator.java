package Factory_Method.ExProduct_slide.creator;

import Factory_Method.ExProduct_slide.interfaces.Product;

public abstract class Creator {
	
	public abstract Product factoryMethod();
	
	public void anOperation() {
		this.product = factoryMethod();
		this.product.message();
	}
	
	private Product product;

}
