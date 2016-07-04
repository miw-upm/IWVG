package designPatterns.patterns.singleton.v4.subclassifing.impossible;

public class Singleton {
	
	public static Singleton instance = new Singleton();
	
	public void m() {
		System.out.println("Ejecuci�n de m de Singleton");
	}
}
