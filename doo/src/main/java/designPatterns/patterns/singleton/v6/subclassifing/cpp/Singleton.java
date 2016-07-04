package designPatterns.patterns.singleton.v6.subclassifing.cpp;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Singleton {

	private static Singleton singleton;
	
	public static Singleton instance() {
		if (singleton == null) {
			String line = Singleton.getSingletonConfigure();
			singleton = SingletonRegistry.instance().lookup(line);
		}
		return singleton;
	}
	
	private static String getSingletonConfigure() {
		BufferedReader in = null;
		String line = "";
		try {
			in = new BufferedReader(new FileReader("singletonConfigure"));
			line = in.readLine().substring(13);
		} catch (IOException ex) {
			System.out.println("IOException al leer: " + ex.getMessage());
		} finally {
			if (in != null) {
				try {
					in.close();
				} catch (IOException ex) {
					System.out.println("IOException al cerrar: "
							+ ex.getMessage());
				}
			}
		}
		return line;
	}
	
	protected Singleton() {

	}

	public void m() {
		System.out.println("Ejecuci�n de m de Singleton");
	}
}
