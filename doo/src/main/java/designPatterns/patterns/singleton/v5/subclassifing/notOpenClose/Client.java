package designPatterns.patterns.singleton.v5.subclassifing.notOpenClose;

public class Client {

	private void exec() {
		// ...
		Singleton.instance().m();
		// ...
	}

	public static void main(String[] args) {
		new Client().exec();
	}

}
