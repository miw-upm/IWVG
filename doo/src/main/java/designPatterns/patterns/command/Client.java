package designPatterns.patterns.command;

public class Client {

	private void exec() {
		//...
		Invoker invoker = new Invoker();
		Receiver receiver = new Receiver();
		//...
		invoker.execute(new ConcreteCommandA(receiver));
		//...
		invoker.execute(new ConcreteCommandB(receiver));
		//...		
	}
	
	public static void main(String[] args){
		new Client().exec();
	}
}
