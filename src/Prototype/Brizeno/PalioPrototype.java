package Prototype.Brizeno;

public class PalioPrototype extends CarroPrototype{

	protected PalioPrototype(PalioPrototype palioPrototype) {
		this.valorCompra = palioPrototype.valorCompra;
	}
	
	public PalioPrototype() {
		this.valorCompra = 0.0;
	}
	
	
	@Override
	public String exibirInfo() {
		return "Modelo: Palio\nMontadora: Wolkswage\n" + "Valor: R$"
                + this.getValorCompra();
	}

	@Override
	public CarroPrototype clonar() {
		return new PalioPrototype(this);
	}

}
