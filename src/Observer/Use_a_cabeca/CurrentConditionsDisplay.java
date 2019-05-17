package Observer.Use_a_cabeca;

public class CurrentConditionsDisplay implements Observer, DisplayElement{

	private float temperature;
	private float humidity;
	private Subject weatherData;
	
	/*
	 * o construtor receber um objeto weatherData (o subject) e nós o usamos para registrar
	 * a exibição como um observador
	 */
	public CurrentConditionsDisplay(Subject weatherData) {
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
