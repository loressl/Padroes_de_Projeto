package Factory_Method.gastos.classes;

import Factory_Method.gastos.interfaces.Gastos;

public class Agua implements Gastos{

	@Override
	public void exibirInfor() {
		System.out.println("Gasto: Água\nTipo de gasto: Consumo");
		
	}

}
