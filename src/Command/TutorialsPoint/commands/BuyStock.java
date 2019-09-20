package Command.TutorialsPoint.commands;

import Command.TutorialsPoint.interfaces.Order;
import Command.TutorialsPoint.receiver.Stock;

public class BuyStock implements Order {

	public BuyStock(Stock stock) {
		this.stock = stock;
	}

	@Override
	public void execute() {
		stock.buy();
	}

	private Stock stock;

}
