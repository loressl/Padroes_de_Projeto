package Singleton;

import Singleton.classes.Aviao;

public class TesteAviao {
	
	public static void main(String[] args) {
		
		agendarAssento("1A");
		agendarAssento("1A");
		
	}
	
	private static void agendarAssento(String assento) {
		Aviao aviao = new Aviao();
		System.out.println(aviao.bookAssento(assento));
	}
}
