package designPatterns.exercises.n4_poker.gambles;

import java.util.ArrayList;
import java.util.List;

import designPatterns.exercises.n4_poker.cards.Card;
import designPatterns.exercises.n4_poker.cards.Suite;
import designPatterns.exercises.n4_poker.cards.Value;

public class PlayerStatistics {

	private int[] valueCont;

	private int[] colorCont;

	public PlayerStatistics(List<Card> cardList) {
		valueCont = new int[Value.values().length];
		colorCont = new int[Suite.values().length];
		for (Card card : cardList) {
			valueCont[card.getValue().ordinal()]++;
			colorCont[card.getSuite().ordinal()]++;
		}
	}
	
	public Value getMaxValue() {
		for (int i = valueCont.length - 1; i >= 0; i--) {
			if (valueCont[i] != 0) {
				return Value.values()[i];
			}
		}
		return null;
	}

	public boolean hasSameValue(int amount) {
		for (int cont : valueCont) {
			if (cont == amount) {
				return true;
			}
		}
		return false;
	}

	public boolean hasSameColor(int amount) {
		for (int cont : colorCont) {
			if (cont == amount) {
				return true;
			}
		}
		return false;
	}

	public boolean hasTwoPairs() {
		int pairs = 0;
		for (int cont : valueCont) {
			if (cont == 2) {
				pairs++;
			}
		}
		return pairs == 2;
	}

	public List<Value> getOrderedValues(int amount) {
		List<Value> result = new ArrayList<Value>();
		for (int i = valueCont.length - 1; i >= 0; i--) {
			if (valueCont[i] == amount) {
				result.add(Value.values()[i]);
			}
		}
		return result;
	}

	public List<Value> getOrderedValues() {
		List<Value> orderedValues = new ArrayList<Value>();
		for (int i = valueCont.length - 1; i >= 0; i--) {
			for (int j = 0; j < valueCont[i]; j++) {
				orderedValues.add(Value.values()[i]);
			}
		}
		return orderedValues;
	}

	public boolean hasStairStart(Value value) {
		for (int i = 0; i < 5; i++) {
			if (valueCont[i + value.ordinal()] != 1) {
				return false;
			}
		}
		return true;
	}

	public boolean hasStair() {
		for (int i = 0; i <= Value.DIEZ.ordinal(); i++) {
			if (this.hasStairStart(Value.values()[i])) {
				return true;
			}
		}
		return false;
	}
}
