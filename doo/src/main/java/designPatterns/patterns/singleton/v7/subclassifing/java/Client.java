package designPatterns.patterns.singleton.v7.subclassifing.java;

public class Client {

	private void exec() {
		//...
		Singleton.instance().m();
		// ...
	}

	public static void main(String[] args) {
		new Client().exec();
	}

}
