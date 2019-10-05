package Observer.thejavageek.interfaces;

public interface Observable {
	public void register(Observer o);
	public void remove(Observer o);
	public void notifyObservers();
}
