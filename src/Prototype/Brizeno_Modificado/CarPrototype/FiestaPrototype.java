package Prototype.Brizeno_Modificado.CarPrototype;

import Prototype.Brizeno_Modificado.Interface.IPrototype;

public class FiestaPrototype implements IPrototype {
	
	private String name;
	private double valor;
	
	public FiestaPrototype(String name, double valor) {
		this.valor = valor;
		this.name = name;
	}
	
	@Override
	public IPrototype clone() {
		return new FiestaPrototype(this.getName(),this.getValor());
	}

	@Override
	public String show() {
		return "Fiesta " + this.getValor();
	}

	public double getValor() {
		return this.valor;
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
