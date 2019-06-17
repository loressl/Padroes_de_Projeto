package Factory_Method.gastos.factorys;

import Factory_Method.gastos.classes.Arrumadeira;
import Factory_Method.gastos.classes.Lavanderia;
import Factory_Method.gastos.interfaces.FabricaDeGastos;
import Factory_Method.gastos.interfaces.Gastos;

public class FabricaServico implements FabricaDeGastos{

	@Override
	public Gastos criarGasto(String gasto) {
		switch (gasto) {
		case "lavanderia":
			return new Lavanderia();
		case "arrumadeira":
			return new Arrumadeira();
		default:
			break;
		}
		return null;
	}

}
