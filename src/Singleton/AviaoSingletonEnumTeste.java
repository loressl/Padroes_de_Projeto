package Singleton;

import Singleton.classes.AviaoSingletonEnum;

public class AviaoSingletonEnumTeste {
	
	public static void main(String[] args) {
		AviaoSingletonEnum.agendarAssento("1A"); 
		AviaoSingletonEnum.agendarAssento("1A");
	}
}
