package Prototype.Brizeno_Modificado.CarPrototype;

import Prototype.Brizeno_Modificado.Interface.IPrototype;

public class GolPrototype implements IPrototype {

	private double valor;
	private String name;
	
	public GolPrototype(String name,double valor) {
		this.valor = valor;
		this.name = name;
	}
	
	@Override
	public IPrototype clone() {
		return new GolPrototype(this.getName(),this.getValor());
	}

	@Override
	public String show() {
		return "Gol " + this.getValor();
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	
	
}
