package Factory_Method.Moeda.classes;

import Factory_Method.Moeda.Interface.Moeda;

public class USDolar implements Moeda{

	@Override
	public String getSimbolo() {
		return "USD";
	}

}
