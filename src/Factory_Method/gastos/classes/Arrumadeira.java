package Factory_Method.gastos.classes;

import Factory_Method.gastos.interfaces.Gastos;

public class Arrumadeira implements Gastos{

	@Override
	public void exibirInfor() {
		System.out.println("Gasto: Arrumadeira\nTipo de gasto: Serviço");
		
	}

}
