package Observer.DZone.observable;

import java.util.ArrayList;
import java.util.List;

import Observer.DZone.interfaces.IObservable;
import Observer.DZone.interfaces.IObserver;

public class Player implements IObservable{
    
    private String name;
    private Integer xCooridinate;
    private Integer yCooridinate;
    
    private List<IObserver> observers ;

    public Player(String name) {
		this.name = name;
		this.observers = new ArrayList<IObserver>();
		xCooridinate=0;
		yCooridinate=0;
	}
    
    public Integer getxCooridinate() {
        return xCooridinate;
    }

    public Integer getyCooridinate() {
        return yCooridinate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void moveForward(Integer steps){
        xCooridinate += steps;
        notifyObservers();
    }

    public void moveBackward(Integer steps){
        xCooridinate-=steps;
        notifyObservers();
    }

    public void jump(Integer height){
        yCooridinate+=height;
        notifyObservers();
    }

    public void fallTo(Integer height){
        yCooridinate=height;
        notifyObservers();
    }

	@Override
	public void notifyObservers() {
		for(IObserver o: observers)
				o.update(this);
	}

	@Override
	public void addObserver(IObserver o) {
		if(o!=null)
			this.observers.add(o);
	}

	@Override
	public void removeObserver(IObserver o) {
		if(o!= null && !observers.isEmpty())
			this.observers.remove(o);
	}
}
