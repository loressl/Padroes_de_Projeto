package Observer.Use_a_cabeca.observer;

import Observer.Use_a_cabeca.interfaces.DisplayElement;
import Observer.Use_a_cabeca.interfaces.Observer;
import Observer.Use_a_cabeca.interfaces.Subject;

public class ForecastDisplay implements Observer, DisplayElement{
	
	private float temperature;
	private float humidity;
	private Subject weatherData;
	
	public ForecastDisplay(Subject weatherData) {
		this.weatherData = weatherData;
		weatherData.registerObserver(this);
	}
	
	@Override
	public void display() {
		System.out.println("Currente conditions: " + temperature + "F degrees and "
				+ humidity + "% humidity.");
		
	}

	@Override
	public void update(float temp, float humidity, float pressure) {
		this.temperature = temp;
		this.humidity = humidity;
		display();
	}

}
