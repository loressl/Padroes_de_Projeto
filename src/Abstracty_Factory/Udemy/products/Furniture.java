package Abstracty_Factory.Udemy.products;

public abstract class Furniture {
	
	private String waterMark;
	
	public Furniture(String waterMark) {
		this.waterMark = waterMark;
	}
	
	public abstract void use();

	public String getWaterMark() {
		return waterMark;
	}

	public void setWaterMark(String waterMark) {
		this.waterMark = waterMark;
	}
	
	
}
