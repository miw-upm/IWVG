package designPatterns.singleton.bad.v3.notOpenCloseWithSubclassifing;

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
