package designPatterns.singleton.good.v1.basic;

public class Singleton {
	
	private static Singleton singleton;
	
	public static Singleton instance() {
		if (singleton == null){
			singleton = new Singleton();
		}
		return singleton;
	}
	
	private Singleton() {
		
	}
	
	public void m() {
		System.out.println("Ejecución de m de Singleton");
	}
}
