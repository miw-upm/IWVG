package designPatterns.patterns.strategy.constructor;

public class Client {

	private void exec() {
		// ...
		Context context;
		// ...
		context = new Context(new ConcreteStrategyA());
		context.contextInterface();
		// ...
		context = new Context(new ConcreteStrategyB());
		context.contextInterface();
		// ...
	}

	public static void main(String[] args) {
		new Client().exec();
	}

}
