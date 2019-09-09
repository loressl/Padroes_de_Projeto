package Brigde.Gof.interfaces;

public abstract class Shape {
	
	public Shape(Color color) {
		this.setColor(color);
	}
	
	public void setColor(Color color) {
		this.color = color;
	}
	
	public abstract void draw();
	
	protected Color color;
}
