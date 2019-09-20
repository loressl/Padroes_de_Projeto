package Command.TutorialsPoint.commands;

import Command.TutorialsPoint.interfaces.Order;
import Command.TutorialsPoint.receiver.Stock;

public class SellStock implements Order{
	
	public SellStock(Stock stock) {
		this.stock = stock;
	}
	
	@Override
	public void execute() {
		stock.sell();
	}
	
	private Stock stock;

}
