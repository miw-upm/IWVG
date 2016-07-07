package designPatterns.patterns.chainOfResponsability;

public class Client {

	private void exec() {
		//...
		Handler handler = new ConcreteHandlerA(
				new ConcreteHandlerA(
				new ConcreteHandlerB()));
		//...
		handler.handlerRequest();
	}

	public static void main(String[] args) {
		new Client().exec();
	}
}
