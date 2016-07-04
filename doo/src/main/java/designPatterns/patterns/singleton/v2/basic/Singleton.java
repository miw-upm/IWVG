package designPatterns.patterns.singleton.v2.basic;

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
		System.out.println("Ejecuci�n de m de Singleton");
	}
}
