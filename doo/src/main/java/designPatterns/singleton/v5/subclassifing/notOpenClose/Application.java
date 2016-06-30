package designPatterns.singleton.v5.subclassifing.notOpenClose;

public class Application {

	private void exec() {
		// ...
		Singleton.instance().m();
		// ...
	}

	public static void main(String[] args) {
		new Application().exec();
	}

}
