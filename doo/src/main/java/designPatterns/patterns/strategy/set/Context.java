package designPatterns.patterns.strategy.set;

public class Context {

	private Strategy strategy;
	
	public void set(Strategy strategy) {
		this.strategy = strategy;
	}
	
	public void contextInterface() {
		System.out.println("pre-strategy");
		strategy.algorithmInterface();
		System.out.println("post-strategy");
	}
}
