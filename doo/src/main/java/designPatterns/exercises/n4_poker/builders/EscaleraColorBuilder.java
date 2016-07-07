package designPatterns.exercises.n4_poker.builders;

import designPatterns.exercises.n4_poker.cards.Card;
import designPatterns.exercises.n4_poker.cards.Value;

class EscaleraColorBuilder extends Builder {

	@Override
	void fillPlayer() {
		Value value = Value.random(Value.NUEVE);
		Card card = deck.getCard(value);
		player.add(card);
		player.add(deck.getCard(value.next(1), card.getSuite()));
		player.add(deck.getCard(value.next(2), card.getSuite()));
		player.add(deck.getCard(value.next(3), card.getSuite()));
		player.add(deck.getCard(value.next(4), card.getSuite()));
	}

}
