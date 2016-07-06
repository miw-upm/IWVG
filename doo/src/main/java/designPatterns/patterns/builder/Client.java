package designPatterns.patterns.builder;

public class Client {

	private void exec() {
		//...
		Director director = new Director();
		//...
		director.set(new ConcreteBuilderA());
		director.construct().writeln();
		//...
		director.set(new ConcreteBuilderB());
		director.construct().writeln();
		//...
	}
	
	public static void main(String[] args){
		new Client().exec();
	}

}
