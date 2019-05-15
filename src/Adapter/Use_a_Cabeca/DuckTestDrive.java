package Adapter.Use_a_Cabeca;

public class DuckTestDrive {
	
	public static void main(String[] args) {
		
		MallarDuck duck = new MallarDuck();
		
		WildTurkey turkey = new WildTurkey();
		Duck turkeyAdapter = new TurkeyAdapter(turkey);
		
		System.out.println("The Turkey says...");
		turkey.gobble();
		turkey.fly();
		
		System.out.println("\nThe Duck says...");
		testDuck(duck);
		
		System.out.println("\nThe TurkeyAdapter says ...");
		testDuck(turkeyAdapter);
		
	}
	
	public static void testDuck(Duck duck) {
		duck.quack();
		duck.fly();
	}
}
