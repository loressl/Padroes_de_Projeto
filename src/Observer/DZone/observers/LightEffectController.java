package Observer.DZone.observers;

import Observer.DZone.interfaces.IObserver;
import Observer.DZone.observable.Player;

public class LightEffectController implements IObserver {

	public void flickerLights() {
		System.out.println("Flicker the lights");
		isLightFlickering = true;
	}

	// MODO PUSH
	@Override
	public void update(Object o) {
		if (o instanceof Player) {
			Player player = (Player) o;
			Integer xCoordiante = player.getxCooridinate();
			if (xCoordiante > 10 && isLightFlickering == false) {
				flickerLights();
			}
		}
	}

	private boolean isLightFlickering = false;
}
