package Decorator.SaladeAula;

import Decorator.SaladeAula.classes.PizzaBasica;
import Decorator.SaladeAula.decorators.AzeitonaDecorator;
import Decorator.SaladeAula.decorators.FrangoDecorator;
import Decorator.SaladeAula.decorators.PresuntoDecorator;
import Decorator.SaladeAula.interfaces.Pizza;
import Decorator.SaladeAula.interfaces.PizzaDecorator;

public class Cliente {

	public static void main(String[] args) {
//		Pizza p2 = new PresuntoDecorator(p);
//		Pizza p3 = new FrangoDecorator(p2);
//		Pizza p4 = new AzeitonaDecorator(p3);
//		
//		p4.montar();
//		
//		System.out.println();
//		PizzaDecorator pd = (PizzaDecorator) p3;
//		
//		pd.setPizzaDecorator(p);
//		pd.montar();
//		
//		System.out.println();
//		pd.setPizzaDecorator(new AzeitonaDecorator(p));
//		pd.montar();
//		
//		System.out.println();
//		pd.setPizzaDecorator(new PresuntoDecorator(p));
//		pd.montar();
//		
//		System.out.println();
//		pd.setPizzaDecorator(new FrangoDecorator(new FrangoDecorator(p)));
//		pd.montar();
		
		Pizza p = new PizzaBasica();
		String[] es= {"Presunto", "Frango", "Frango","Azeitona"};
		for(String string : es) {
			if(string.equalsIgnoreCase("Presunto"))
				p = new PresuntoDecorator(p);
			else if(string.equalsIgnoreCase("Frango"))
				p = new FrangoDecorator(p);
			else
				p = new AzeitonaDecorator(p);
		}
		
		p.montar();
		
	}

}
