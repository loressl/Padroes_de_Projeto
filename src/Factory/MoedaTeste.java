package Factory;

import Factory.classes.Moeda;
import Factory.classes.MoedaFactory;
import Factory.classes.Pais;

public class MoedaTeste {
	
	public static void main(String[] args) {
		Moeda moeda = MoedaFactory.criarMoeda(Pais.BRASIL);
		
		System.out.println(moeda.getSimbolo());
	}
}
