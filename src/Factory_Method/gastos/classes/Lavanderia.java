package Factory_Method.gastos.classes;

import Factory_Method.gastos.interfaces.Gastos;

public class Lavanderia implements Gastos{

	@Override
	public void exibirInfor() {
		System.out.println("Gasto: Lavanderia\nTipo de gasto: Serviço");
		
	}

}
