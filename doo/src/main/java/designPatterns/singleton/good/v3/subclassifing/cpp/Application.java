package designPatterns.singleton.good.v3.subclassifing.cpp;

public class Application {

	private void exec() {
		// ...
		// necesario en Java por ejecución de static en carga, no en C++
		ASingleton.register();
		BSingleton.register();
		//...
		Singleton.instance().m();
		// ...
	}

	public static void main(String[] args) {
		new Application().exec();
	}

}
