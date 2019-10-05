package Strategy.tutorialsPoint.concreteStrategy;

import Strategy.tutorialsPoint.interfaces.IStrategy;

public class OperationSubstract implements IStrategy {

	@Override
	public int doOperation(int n1, int n2) {
		return n1-n2;
	}

}
