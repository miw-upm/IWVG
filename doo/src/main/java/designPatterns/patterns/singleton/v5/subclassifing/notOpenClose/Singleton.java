package designPatterns.patterns.singleton.v5.subclassifing.notOpenClose;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public abstract class Singleton {

	private static Singleton singleton;

	public static Singleton instance() {
		if (singleton == null) {
			String line = Singleton.getSingletonConfigure();
			if (line.equals("ASingleton")) {
				singleton = new ASingleton();
			} else if (line.equals("BSingleton")) {
				singleton = new BSingleton();
			} else { 
				assert false;
			}
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
