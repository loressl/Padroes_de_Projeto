package Singleton;

import Singleton.classes.Singleton;

public class TesteSingleton {

	public static void main(String[] args) {
		Singleton s1= Singleton.getFirstInstance();
		Singleton s2= Singleton.getFirstInstance();
		
		print("s1", s1);
		print("s2", s2);

	}
	
	public static void print(String name, Singleton object) {
		System.out.println(String.format("Object: %s, Hashcode: %d", name, object.hashCode()));
	}

}
