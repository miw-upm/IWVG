package designPatterns.exercises.n4_poker.cards;

import java.util.Random;

public enum Value {
	DOS("2"), TRES("3"), CUATRO("4"), CINCO("5"), SEIS("6"), SIETE("7"), OCHO(
			"8"), NUEVE("9"), DIEZ("10"), INFANTE("J"), REINA("Q"), REY("K"), AS(
			"As");

	private String title;

	private Value(String title) {
		this.title = title;
	}

	public String getTitle() {
		return title;
	}

	public boolean greater(Value value) {
		return this.ordinal() > value.ordinal();
	}

	public static Value random(Value max) {
		Random random = new Random(System.currentTimeMillis());
		return Value.values()[random.nextInt(max.ordinal())];
	}
	
	public static Value random() {
		return Value.random(Value.AS);
	}

	private Value next() {
		return Value.values()[(this.ordinal() + 1) % Value.values().length];
	}

	public Value next(int amount) {
		Value value = this;
		for (int i = 0; i < amount; i++) {
			value = value.next();
		}
		return value;
	}

}
