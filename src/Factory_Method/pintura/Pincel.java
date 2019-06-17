package Factory_Method.pintura;

import Factory_Method.pintura.factory.FactoryCor;
import Factory_Method.pintura.interfaces.Cor;

public class Pincel {
 
	 public void pintar() {
		 Cor corEscolhida;
		 FactoryCor fabricaDeCor = new FactoryCor();
		 
		 corEscolhida = fabricaDeCor.getCor("verde");
		 corEscolhida.colorir();
		 
		 corEscolhida = fabricaDeCor.getCor("azul");
		 corEscolhida.colorir();
		 
		 corEscolhida = fabricaDeCor.getCor("vermelho");
		 corEscolhida.colorir();
		 
	 }
}
