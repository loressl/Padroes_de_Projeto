package Factory_Method.ExProduct_slide.classes;

import Factory_Method.ExProduct_slide.creator.Creator;
import Factory_Method.ExProduct_slide.interfaces.Product;

public class Cliente {
	
	public static void setConcreteCreator(Creator creator) {
		creator.anOperation();
	}
	
	public static void main(String[] args) {
		setConcreteCreator(new ConcreteCreator());
	}
}
