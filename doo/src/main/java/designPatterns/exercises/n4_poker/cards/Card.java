package designPatterns.exercises.n4_poker.cards;

public class Card {

	private Value value;
	
	private Suite suite;
	
	Card(Value value, Suite suite){
		this.value = value;
		this.suite = suite;
	}
	
	public Value getValue() {
		return value;
	}
	
	public Suite getSuite() {
		return suite;
	}

	public boolean greater(Card card) {
		return value.greater(card.value);
	}

	@Override
	public String toString() {
		return "Card [" + value.getTitle() + ", " + suite.getTitle() + "]";
	}
	
	


}
