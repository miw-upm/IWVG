package designPatterns.singleton.bad.v3.notOpenCloseWithSubclassifing;

public class BSingleton extends Singleton {

	
	protected BSingleton(){
		super();
	}
	
	public void m() {
		System.out.println("Ejecución de m de BSingleton");
	}
}
