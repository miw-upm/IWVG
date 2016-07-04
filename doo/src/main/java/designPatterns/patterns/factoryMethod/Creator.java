package designPatterns.patterns.factoryMethod;

public abstract class Creator {

	public void operation() {
		System.out.println("Antes del factory method");
		this.factoryMethod().write();
		System.out.println("Después del factory method");
	}
	
	protected abstract Product factoryMethod();
}
