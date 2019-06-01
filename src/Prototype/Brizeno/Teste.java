package Prototype.Brizeno;

public class Teste {
	
	public static void main(String[] args) {
		 PalioPrototype prototipoPalio = new PalioPrototype();
		 
		    CarroPrototype palioNovo = prototipoPalio.clonar();
		    palioNovo.setValorCompra(27900.0);
		    CarroPrototype palioUsado = prototipoPalio.clonar();
		    palioUsado.setValorCompra(21000.0);
		 
		    System.out.println(palioNovo.exibirInfo());
		    System.out.println(palioUsado.exibirInfo());	
	}
}
