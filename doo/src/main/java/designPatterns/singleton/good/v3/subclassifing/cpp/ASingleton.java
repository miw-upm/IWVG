package designPatterns.singleton.good.v3.subclassifing.cpp;

public class ASingleton extends Singleton {

	protected ASingleton() {
		super();
		SingletonRegistry.instance().register("ASingleton", this);
	}

	public void m() {
		System.out.println("Ejecución de m de ASingleton");
	}
	
	// necesario en Java por ejecución de static en carga, no en C++
	public static void register() {
		new ASingleton();
	}
}
