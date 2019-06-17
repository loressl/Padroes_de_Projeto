package Factory_Method.pintura.classes;

import Factory_Method.pintura.interfaces.Cor;

public class Verde implements Cor {

	@Override
	public void colorir() {
		System.out.println("Colorido de Verde");
	}

}
