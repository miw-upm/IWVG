package designPatterns.singleton.good.v3.subclassifing.java;

public class BSingleton extends Singleton {

	protected BSingleton() {
		super();
	}

	public void m() {
		System.out.println("Ejecución de m de BSingleton");
	}
	
}
