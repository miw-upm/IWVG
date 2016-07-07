package designPatterns.exercises.n4_poker.cards;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {

	private List<Card> cardList;

	public Deck() {
		cardList = new ArrayList<Card>();
		for (int i = 0; i < Suite.values().length; i++) {
			for (int j = 0; j < Value.values().length; j++) {
				cardList.add(CardFlyweight.instance().getCard(Value.values()[j], Suite.values()[i]));
			}
		}
		Collections.shuffle(cardList);
	}

	public Card getCard(Value value) {
		Card result = null;
		for (Card card : cardList) {
			if (card.getValue().equals(value)) {
				result = card;
			}
		}
		if (result != null) {
			cardList.remove(result);
		}
		return result;
	}

	public Card getCard(Suite suite) {
		Card result = null;
		for (Card card : cardList) {
			if (card.getSuite().equals(suite)) {
				result = card;
			}
		}
		if (result != null) {
			cardList.remove(result);
		}
		return result;
	}

	public Card getCard(Value value, Suite suite) {
		Card result = null;
		for (Card card : cardList) {
			if (card.getValue().equals(value) && card.getSuite().equals(suite)) {
				result = card;
			}
		}
		if (result != null) {
			cardList.remove(result);
		}
		return result;
	}

	public Card getCard() {
		return cardList.remove(0);
	}
}
