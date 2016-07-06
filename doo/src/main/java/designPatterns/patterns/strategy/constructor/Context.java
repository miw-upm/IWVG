package designPatterns.patterns.strategy.constructor;

public class Context {

	private Strategy strategy;
	
	public Context(Strategy strategy) {
		this.strategy = strategy;
	}
	
	public void contextInterface() {
		System.out.println("pre-strategy");
		strategy.algorithmInterface();
		System.out.println("post-strategy");
	}
}
