package Observer.Use_a_cabeca.subject;

import java.util.ArrayList;

import Observer.Use_a_cabeca.interfaces.Observer;
import Observer.Use_a_cabeca.interfaces.Subject;

public class WeatherData implements Subject{
	
	//lista de observadores 
	private ArrayList<Observer> observers;
	private float temperatura;
	private float humidity;
	private float pressure;
	
	public WeatherData() {
		observers = new ArrayList<>();
	}
	
	//se registrar um observador, só add na lista
	@Override
	public void registerObserver(Observer o) {
		observers.add(o);
		
	}

	@Override
	public void removeObserver(Observer o) {
		int i = observers.indexOf(o);//procura o objeto q é igual na lista e pega a posição dele
		
		if(i>=0) {
			observers.remove(i);//remove pela posição
		}
		
	}
	
	//notifica todos os observadores sobre o estado
	@Override
	public void notifyObservers() {
		for(int i=0; i< observers.size(); i++) {
			Observer observer = (Observer)observers.get(i);
			observer.update(temperatura, humidity, pressure);
		}
		
	}
	
	//notifca os observadores quando tem medições atualizadas da estação
	public void measurementsChanged() {
		notifyObservers();
	}
	
	public void setMeasurements(float temperature, float humidity, float pressure) {
		this.temperatura = temperature;
		this.humidity = humidity;
		this.pressure = pressure;
		measurementsChanged();
	}

}
