package Strategy.tutorialsPoint;

import Strategy.tutorialsPoint.concreteStrategy.OperationAdd;
import Strategy.tutorialsPoint.concreteStrategy.OperationMultiply;
import Strategy.tutorialsPoint.concreteStrategy.OperationSubstract;
import Strategy.tutorialsPoint.context.Context;

//https://www.tutorialspoint.com/design_pattern/strategy_pattern.htm
public class StrategyPatternDemo {

	public static void main(String[] args) {
		Context context = new Context(new OperationAdd());
		System.out.println("10 + 5 = " + context.executeStrategy(10, 5));
		
		context = new Context(new OperationSubstract());
		System.out.println("10 - 5 = "+ context.executeStrategy(10, 5));
		
		context = new Context(new OperationMultiply());
		System.out.println("10 * 5 = "+ context.executeStrategy(10, 5));

	}

}
