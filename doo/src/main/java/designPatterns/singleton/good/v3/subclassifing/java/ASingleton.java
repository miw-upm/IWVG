package designPatterns.singleton.good.v3.subclassifing.java;

public class ASingleton extends Singleton {

	protected ASingleton() {
		super();
	}

	public void m() {
		System.out.println("Ejecución de m de ASingleton");
	}
	
}
