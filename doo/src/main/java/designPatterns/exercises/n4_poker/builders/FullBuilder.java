package designPatterns.exercises.n4_poker.builders;

import designPatterns.exercises.n4_poker.cards.Value;

class FullBuilder extends Builder {

	@Override
	void fillPlayer() {
		Value value = Value.random();
		player.add(deck.getCard(value));
		player.add(deck.getCard(value));
		player.add(deck.getCard(value));
		player.add(deck.getCard(value.next(1)));
		player.add(deck.getCard(value.next(1)));
	}

}
