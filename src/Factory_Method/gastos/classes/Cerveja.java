package Factory_Method.gastos.classes;

import Factory_Method.gastos.interfaces.Gastos;

public class Cerveja implements Gastos{

	@Override
	public void exibirInfor() {
		System.out.println("Gasto: Cerveja\nTipo de gasto: Consumo");
		
	}

}
