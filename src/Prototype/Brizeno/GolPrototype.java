package Prototype.Brizeno;

public class GolPrototype extends CarroPrototype{

	protected GolPrototype(GolPrototype golPrototype) {
		this.valorCompra = golPrototype.valorCompra;
	}
	
	public GolPrototype() {
		this.valorCompra = 0.0;
	}
	
	@Override
	public String exibirInfo() {
		return "Modelo: Gol\nMontadora: Wolkswage\n" + "Valor: R$"
                + this.getValorCompra();
	}

	@Override
	public CarroPrototype clonar() {
		return new GolPrototype(this);
	}

}
