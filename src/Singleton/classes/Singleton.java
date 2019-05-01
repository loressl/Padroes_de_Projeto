package Singleton.classes;

/**
 * 
 * só pode haver uma instancia do objeto na memória
 *
 */

public class Singleton {
	//CREATINE PATTERNS
	
	//eager instance ou instancia gulosa
	//private static Singleton firstInstance = new Singleton();
	private static Singleton firstInstance = null;
	
	private Singleton() {}
	
	//lazy instance
	public static Singleton getFirstInstance() {
		
		if(firstInstance == null) {
			synchronized (Singleton.class) {//double checked locking
				if(firstInstance == null)
					firstInstance = new Singleton();
			}
		}
		
		return firstInstance;
		
	}

}
