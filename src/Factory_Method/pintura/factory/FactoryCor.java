package Factory_Method.pintura.factory;

import Factory_Method.pintura.classes.Azul;
import Factory_Method.pintura.classes.Verde;
import Factory_Method.pintura.classes.Vermelho;
import Factory_Method.pintura.interfaces.Cor;

public class FactoryCor {
	
	public Cor getCor(String nomeDeCor) {
		switch (nomeDeCor) {
		case "verde":
			return new Verde();
		case "azul":
			return new Azul();
		case "vermelho":
			return new Vermelho();
		default:
			return null;
		}
	}
}
