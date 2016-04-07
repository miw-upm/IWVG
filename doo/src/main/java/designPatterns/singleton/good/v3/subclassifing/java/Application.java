package designPatterns.singleton.good.v3.subclassifing.java;

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
