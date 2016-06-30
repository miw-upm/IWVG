package designPatterns.singleton.v7.subclassifing.java;

public class Application {

	private void exec() {
		//...
		Singleton.instance().m();
		// ...
	}

	public static void main(String[] args) {
		new Application().exec();
	}

}
