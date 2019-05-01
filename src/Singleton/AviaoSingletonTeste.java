package Singleton;

import Singleton.classes.AviaoSingleton;

public class AviaoSingletonTeste {
	
	public static void main(String[] args) {
		agendarAssento("1A");
		agendarAssento("1A");
	}
	
	private static void agendarAssento(String assento) {
		AviaoSingleton aviao = AviaoSingleton.getINSTANCE();
		System.out.println(aviao.bookAssento(assento));
	}
}
