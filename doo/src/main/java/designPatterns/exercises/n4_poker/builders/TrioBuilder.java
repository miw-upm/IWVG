package designPatterns.exercises.n4_poker.builders;

import designPatterns.exercises.n4_poker.cards.Card;
import designPatterns.exercises.n4_poker.cards.Value;

class TrioBuilder extends Builder {

	@Override
	void fillPlayer() {
		Value value = Value.random();
		Card card = deck.getCard(value);
		player.add(card);
		player.add(deck.getCard(value));
		player.add(deck.getCard(value));
		player.add(deck.getCard(value.next(1), card.getSuite().next(1)));
		player.add(deck.getCard(value.next(2)));
	}

}
