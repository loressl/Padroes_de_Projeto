package Observer.DZone;

import Observer.DZone.observable.Player;
import Observer.DZone.observers.LightEffectController;
import Observer.DZone.observers.SoundEffectController;

//https://dzone.com/articles/observer-pattern

public class Cliente {
	public static void main(String[] args) {
		Player myDog = new Player("ScoobyDoo");

        myDog.addObserver(new SoundEffectController());
        myDog.addObserver(new LightEffectController());
        
        myDog.moveForward(2);
        System.out.println("Nothing yet.");
        myDog.moveForward(3);
        System.out.println("Nothing yet.");

        myDog.moveForward(7);
        
        myDog.jump(3);
	}
}
