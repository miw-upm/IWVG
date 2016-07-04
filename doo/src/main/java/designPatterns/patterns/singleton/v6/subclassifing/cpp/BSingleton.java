package designPatterns.patterns.singleton.v6.subclassifing.cpp;

public class BSingleton extends Singleton {

	protected BSingleton() {
		super();
		SingletonRegistry.instance().register("BSingleton", this);
	}

	public void m() {
		System.out.println("Ejecuci�n de m de BSingleton");
	}
	
	// necesario en Java por ejecuci�n de static en carga, no en C++
	public static void register() {
		new BSingleton();
	}
}
