package designPatterns.patterns.singleton.v5.subclassifing.notOpenClose;

public class ASingleton extends Singleton {

	
	protected ASingleton(){
		super();
	}
	
	public void m() {
		System.out.println("Ejecuci�n de m de ASingleton");
	}
}
