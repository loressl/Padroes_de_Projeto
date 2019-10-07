package Observer.DZone.interfaces;

public interface IObservable {
	public void notifyObservers();

	public void addObserver(IObserver o);

	public void removeObserver(IObserver o);
}
