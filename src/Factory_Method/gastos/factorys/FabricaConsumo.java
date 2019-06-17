package Factory_Method.gastos.factorys;

import Factory_Method.gastos.classes.Agua;
import Factory_Method.gastos.classes.Cerveja;
import Factory_Method.gastos.interfaces.FabricaDeGastos;
import Factory_Method.gastos.interfaces.Gastos;

public class FabricaConsumo implements FabricaDeGastos{

	@Override
	public Gastos criarGasto(String gasto) {
		switch (gasto) {
		case "cerveja":
			return new Cerveja();
		case "água":
			return new Agua();
		default:
			break;
		}
		return null;
	}

}
