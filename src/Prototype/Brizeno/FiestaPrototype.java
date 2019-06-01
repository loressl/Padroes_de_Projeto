package Prototype.Brizeno;

public class FiestaPrototype extends CarroPrototype{

	protected FiestaPrototype(FiestaPrototype fiestaPrototype) {
		this.valorCompra = fiestaPrototype.valorCompra;
	}
	
	public FiestaPrototype() {
		this.valorCompra = 0.0;
	}
	
	@Override
	public String exibirInfo() {
		
		return "Modelo: Fiesta\nMontadora: Ford\n" + "Valor: R$"
                + this.getValorCompra();
	}

	@Override
	public CarroPrototype clonar() {
		return new FiestaPrototype(this);
	}

}
