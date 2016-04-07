package designPatterns.singleton.good.v3.subclassifing.cpp;

public class BSingleton extends Singleton {

	protected BSingleton() {
		super();
		SingletonRegistry.instance().register("BSingleton", this);
	}

	public void m() {
		System.out.println("Ejecución de m de BSingleton");
	}
	
	// necesario en Java por ejecución de static en carga, no en C++
	public static void register() {
		new BSingleton();
	}
}
