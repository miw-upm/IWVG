package designPatterns.patterns.factoryMethod;

public class Client {

	private void exec() {
		//...
		Creator creator;
		//...
		creator = new ConcreteCreatorA();
		creator.operation();
		//...
		creator = new ConcreteCreatorB();
		creator.operation();
		//...
	}
	
	public static void main(String[] arg){
		new Client().exec();
	}

}
