package Factory_Method.Moeda;

import Factory_Method.Moeda.Interface.Moeda;
import Factory_Method.Moeda.classes.Pais;
import Factory_Method.Moeda.factory.MoedaFactory;

public class MoedaTeste {
	
	public static void main(String[] args) {
		Moeda moeda = MoedaFactory.criarMoeda(Pais.BRASIL);
		
		System.out.println(moeda.getSimbolo());
	}
}
