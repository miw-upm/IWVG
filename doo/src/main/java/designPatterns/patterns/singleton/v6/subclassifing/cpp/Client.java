package designPatterns.patterns.singleton.v6.subclassifing.cpp;

public class Client {

	private void exec() {
		// ...
		// necesario en Java por ejecuci�n de static en carga, no en C++
		ASingleton.register();
		BSingleton.register();
		//...
		Singleton.instance().m();
		// ...
	}

	public static void main(String[] args) {
		new Client().exec();
	}

}
