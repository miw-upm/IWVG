package designPatterns.patterns.abstractFactory;

public class Client {

	private void exec() {
		//...
		AbstractFactory abstractFactory;
		//...
		abstractFactory = new ConcreteFactoryA();
		abstractFactory.createProductA().write();
		abstractFactory.createProductB().write();
		// ...
		abstractFactory = new ConcreteFactoryB();
		abstractFactory.createProductA().write();
		abstractFactory.createProductB().write();
		//...
	}
	
	public static void main(String[] args){
		new Client().exec();
	}

}
