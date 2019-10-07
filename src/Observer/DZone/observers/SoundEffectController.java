package Observer.DZone.observers;

import Observer.DZone.interfaces.IObserver;
import Observer.DZone.observable.Player;

public class SoundEffectController implements IObserver {

	public void playSound() {
		System.out.println("Play an eerie sound");
		isSoundPlaying = true;
	}

	// MODO PUSH
	@Override
	public void update(Object o) {
		if (o instanceof Player) {
			Player player = (Player) o;
			Integer yCoordiante = player.getyCooridinate();
			if (yCoordiante > 0 && isSoundPlaying == false)
				playSound();
		}
	}

	private boolean isSoundPlaying = false;

}
