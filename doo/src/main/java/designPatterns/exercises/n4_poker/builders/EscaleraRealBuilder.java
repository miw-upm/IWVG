package designPatterns.exercises.n4_poker.builders;

import designPatterns.exercises.n4_poker.cards.Card;
import designPatterns.exercises.n4_poker.cards.Value;

class EscaleraRealBuilder extends Builder {

	@Override
	void fillPlayer() {
		Card card = deck.getCard(Value.DIEZ);
		player.add(card);
		player.add(deck.getCard(card.getValue().next(1), card.getSuite()));
		player.add(deck.getCard(card.getValue().next(2), card.getSuite()));
		player.add(deck.getCard(card.getValue().next(3), card.getSuite()));
		player.add(deck.getCard(card.getValue().next(4), card.getSuite()));
	}

}