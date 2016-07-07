package designPatterns.exercises.n4_poker.cards;

public class CardFlyweight {

	private static CardFlyweight cardFlyweight;

	public static CardFlyweight instance() {
		if (cardFlyweight == null) {
			cardFlyweight = new CardFlyweight();
		}
		return cardFlyweight;
	}

	private Card[][] cards;

	private CardFlyweight() {
		cards = new Card[Suite.values().length][Value.values().length];
		for (int i = 0; i < Suite.values().length; i++) {
			for (int j = 0; j < Value.values().length; j++) {
				cards[i][j] = new Card(Value.values()[j], Suite.values()[i]);
			}
		}
	}

	public Card getCard(Value value, Suite suite) {
		return cards[suite.ordinal()][value.ordinal()];
	}

}
