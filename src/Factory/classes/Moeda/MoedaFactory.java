package Factory.classes.Moeda;

/**
 * 
 * Padrão Factory retorna um objeto concreto de uma determinada classe
 * Ajuda a desacoplar a criação dos objetos com as classes
 */

public class MoedaFactory {
	
	public static Moeda criarMoeda(Pais pais) {
		
		if(pais.equals(pais.BRASIL))
			return new Real();
		else if(pais.equals(pais.EUA))
			return new USDolar();
		
		throw new IllegalArgumentException("Não existe esse país!!");
		
	}
}
