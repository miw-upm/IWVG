package designPatterns.exercises.n4_poker.builders;

import designPatterns.exercises.n4_poker.cards.Card;
import designPatterns.exercises.n4_poker.cards.Value;

class CartaAltaBuilder extends Builder {

	@Override
	void fillPlayer() {
		Value value = Value.random();
		Card card = deck.getCard(value);
		player.add(card);
		player.add(deck.getCard(value.next(1), card.getSuite().next(1)));
		player.add(deck.getCard(value.next(2)));
		player.add(deck.getCard(value.next(3)));
		player.add(deck.getCard(value.next(5)));
	}

}
