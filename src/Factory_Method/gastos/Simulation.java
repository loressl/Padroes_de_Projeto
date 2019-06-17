package Factory_Method.gastos;

import Factory_Method.gastos.factorys.FabricaConsumo;
import Factory_Method.gastos.factorys.FabricaServico;
import Factory_Method.gastos.interfaces.FabricaDeGastos;
import Factory_Method.gastos.interfaces.Gastos;

public class Simulation {

	public static void main(String[] args) {
		FabricaDeGastos fabrica = new FabricaConsumo();
		Gastos gastos = fabrica.criarGasto("cerveja");
		gastos.exibirInfor();
		
		fabrica = new FabricaConsumo();
		gastos = fabrica.criarGasto("água");
		gastos.exibirInfor();
		
		fabrica = new FabricaServico();
		gastos = fabrica.criarGasto("arrumadeira");
		gastos.exibirInfor();
		
		fabrica = new FabricaServico();
		gastos = fabrica.criarGasto("lavanderia");
		gastos.exibirInfor();

	}

}
