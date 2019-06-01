package Prototype.Brizeno;

public abstract class CarroPrototype {
	
	protected double valorCompra;
	
	public abstract String exibirInfo();
	
	public abstract CarroPrototype clonar();

	public double getValorCompra() {
		return this.valorCompra;
	}

	public void setValorCompra(double valorCompra) {
		this.valorCompra = valorCompra;
	}
	
	
}
