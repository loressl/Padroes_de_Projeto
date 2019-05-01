package Singleton.classes;

import java.util.HashSet;
import java.util.Set;

public class AviaoSingleton {
	
	//eager initialization = inicialização gulosa
	//private static final AviaoSingleton INSTANCE = new AviaoSingleton();
	
	private static AviaoSingleton INSTANCE;
	private Set<String> assentosDisponiveis;
	
	//eager
//	public static AviaoSingleton getINSTANCE() {
//		return INSTANCE;
//	}
	
	//lazy initialization = só vai criar se for utilizar aquela instancia, forma preguiçosa
	public static AviaoSingleton getINSTANCE() {
		//se tiver utilizando threads pode ter problema, pois pode criar instancias , threads ocorrendo na mesmo hora
		//poderia colocar synchronized na descrição do método, mas pode ter queda no desempenho por esperar outras locks ser liberados
		
		if(INSTANCE == null) {
			synchronized (AviaoSingleton.class) {//depois q verifica, pega o lock e checa de novo para saber se a instancia é nula
				if(INSTANCE == null) {
					INSTANCE = new AviaoSingleton();					
				}
			}
		}
		
		return INSTANCE;
	}
	
	private AviaoSingleton() {
		this.assentosDisponiveis = new HashSet<>();
		assentosDisponiveis.add("1A");
		assentosDisponiveis.add("1B");
	}
	
	public boolean bookAssento(String assento) {
		return assentosDisponiveis.remove(assento);
	}
	
	//melhor forma no java de criar um singleton é com enum
}
