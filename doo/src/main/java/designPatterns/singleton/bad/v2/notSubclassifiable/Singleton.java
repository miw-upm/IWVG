package designPatterns.singleton.bad.v2.notSubclassifiable;

public class Singleton {
	
	public static Singleton instance = new Singleton();
	
	public void m() {
		System.out.println("Ejecución de m de Singleton");
	}
}
