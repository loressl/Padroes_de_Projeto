package Factory_Method.Animal.factory;

import Factory_Method.Animal.classes.Bird;
import Factory_Method.Animal.classes.Cat;
import Factory_Method.Animal.classes.Dog;
import Factory_Method.Animal.interfaces.IAnimal;
import Factory_Method.Animal.interfaces.IFactory;

public class AnimalFactory implements IFactory{

	@Override
	public IAnimal createAnimal(String type) {
		if(type.equals("Dog"))
			return new Dog();
		else if(type.equals("Cat"))
			return new Cat();
		else if(type.equals("Bird"))
			return new Bird();
		
		return null;
	}
	
}
