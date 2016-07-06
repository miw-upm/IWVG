package designPatterns.patterns.templateMethod.v2;

public class Client {

	private void exec() {
		// ...
		AbstractClass abstractClass;
		// ..
		abstractClass = new ConcreteClassA();
		abstractClass.templateMethod();
		// ..
		abstractClass = new ConcreteClassB();
		abstractClass.templateMethod();
		// ..
	}

	public static void main(String[] args) {
		new Client().exec();
	}

}
