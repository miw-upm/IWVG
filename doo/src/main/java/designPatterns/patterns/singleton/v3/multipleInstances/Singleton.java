package designPatterns.patterns.singleton.v3.multipleInstances;

import java.util.ArrayList;
import java.util.List;

public class Singleton {

	private static List<Singleton> singletonList = new ArrayList<Singleton>();

	private static final String[] NAMES = {"A", "B", "C"};
	
	private static final int MAX = NAMES.length;
	
	private static int turn = 0;

	public static Singleton instance() {
		if (singletonList.size() < MAX) {
			singletonList.add(new Singleton(NAMES[turn]));
		}
		int turn = Singleton.turn;
		Singleton.turn = (Singleton.turn + 1)%MAX;
		return singletonList.get(turn);
	}

	private String name;
	
	private Singleton(String name) {
		this.name = name;
	}

	public void m() {
		System.out.println("Ejecuci�n de m de Singleton del objeto: " + name);
	}
}
