package Singleton.classes;

import java.util.HashSet;
import java.util.Set;

/**
 * 
 * aqui n�o utiliza m�todo sincronized e nem o getInstance
 *
 */
public enum AviaoSingletonEnum {
	
	INSTANCE;
	private Set<String> assentosDisponiveis;
	
	//TODOS OS CONSTRUTORES DE ENUM s�o privados
	AviaoSingletonEnum() {
		this.assentosDisponiveis = new HashSet<>();
		assentosDisponiveis.add("1A");
		assentosDisponiveis.add("1B");
	}
	
	public boolean bookAssento(String assento) {
		return assentosDisponiveis.remove(assento);
	}
	
	public static void agendarAssento(String assento) {
		AviaoSingletonEnum aviao = AviaoSingletonEnum.INSTANCE;
		System.out.println(aviao.bookAssento(assento));
	}
}
