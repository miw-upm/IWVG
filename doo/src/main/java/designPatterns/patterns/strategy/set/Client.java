package designPatterns.patterns.strategy.set;

public class Client {

	private void exec() {
		// ...
		Context context = new Context();
		// ...
		context.set(new ConcreteStrategyA());
		context.contextInterface();
		// ...
		context.set(new ConcreteStrategyB());
		context.contextInterface();
		// ...
	}

	public static void main(String[] args) {
		new Client().exec();
	}

}
