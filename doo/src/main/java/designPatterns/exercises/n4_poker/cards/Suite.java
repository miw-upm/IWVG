package designPatterns.exercises.n4_poker.cards;

import java.util.Random;

public enum Suite {
	CORAZONES("C"),	
	DIAMANTES("D"),
	PICAS("P"),
	TREBOLES("T");

	private String title;

	private Suite(String title){
		this.title = title;
	}
	
	public String getTitle() {
		return title;
	}
	
	public static Suite random(){
		Random random = new Random(System.currentTimeMillis());
		return Suite.values()[random.nextInt(Suite.values().length)];
	}
	
	private Suite next() {
		return Suite.values()[(this.ordinal()+1)%Suite.values().length];
	}
	
	public Suite next(int amount) {
		Suite suite = this;
		for (int i = 0; i < amount; i++) {
			suite = suite.next();
		}
		return suite;
	}
}
