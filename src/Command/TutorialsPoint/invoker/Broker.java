package Command.TutorialsPoint.invoker;

import java.util.ArrayList;

import Command.TutorialsPoint.interfaces.Order;

public class Broker {
	
	public void takeOrder(Order order) {
		orders.add(order);
	}
	
	public void placeOrder() {
		for(Order order: orders)
			order.execute();
		orders.clear();
	}
	
	private ArrayList<Order> orders= new ArrayList<>();
		
}
