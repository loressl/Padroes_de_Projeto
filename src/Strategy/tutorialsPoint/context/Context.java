package Strategy.tutorialsPoint.context;

import Strategy.tutorialsPoint.interfaces.IStrategy;

public class Context {
	
	public Context(IStrategy strategy) {
		this.strategy = strategy;
	}
	
	public int executeStrategy(int n1, int n2) {
		return strategy.doOperation(n1, n2);
	}

	private IStrategy strategy;
}
