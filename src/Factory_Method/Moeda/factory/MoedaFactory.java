package Factory_Method.Moeda.factory;

import Factory_Method.Moeda.Interface.Moeda;
import Factory_Method.Moeda.classes.Pais;
import Factory_Method.Moeda.classes.Real;
import Factory_Method.Moeda.classes.USDolar;

/**
 * 
 * Padr�o Factory retorna um objeto concreto de uma determinada classe
 * Ajuda a desacoplar a cria��o dos objetos com as classes
 */

public class MoedaFactory {
	
	public static Moeda criarMoeda(Pais pais) {
		
		if(pais.equals(pais.BRASIL))
			return new Real();
		else if(pais.equals(pais.EUA))
			return new USDolar();
		
		throw new IllegalArgumentException("N�o existe esse pa�s!!");
		
	}
}
