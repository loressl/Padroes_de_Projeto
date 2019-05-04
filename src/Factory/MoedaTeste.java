package Factory;

import Factory.classes.Moeda.Moeda;
import Factory.classes.Moeda.MoedaFactory;
import Factory.classes.Moeda.Pais;

public class MoedaTeste {
	
	public static void main(String[] args) {
		Moeda moeda = MoedaFactory.criarMoeda(Pais.BRASIL);
		
		System.out.println(moeda.getSimbolo());
	}
}
