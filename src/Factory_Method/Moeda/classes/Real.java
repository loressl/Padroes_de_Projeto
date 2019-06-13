package Factory_Method.Moeda.classes;

import Factory_Method.Moeda.Interface.Moeda;

public class Real implements Moeda{

	@Override
	public String getSimbolo() {
		return "R$";
	}

}
