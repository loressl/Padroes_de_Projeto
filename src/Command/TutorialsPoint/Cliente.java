package Command.TutorialsPoint;

import Command.TutorialsPoint.commands.BuyStock;
import Command.TutorialsPoint.commands.SellStock;
import Command.TutorialsPoint.invoker.Broker;
import Command.TutorialsPoint.receiver.Stock;

public class Cliente {

	public static void main(String[] args) {
		Stock stock = new Stock();
		
		BuyStock buyStock = new BuyStock(stock);
		SellStock sellStock = new SellStock(stock);
		
		Broker broker = new Broker();
		broker.takeOrder(buyStock);
		broker.takeOrder(sellStock);
		
		broker.placeOrder();
	}

}
