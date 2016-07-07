package designPatterns.exercises.n4_poker.builders;

import designPatterns.exercises.n4_poker.cards.Deck;
import designPatterns.exercises.n4_poker.players.Player;

abstract class Builder {

	protected Deck deck;
	
	protected Player player;
	
	Player build(){
		deck = new Deck();
		player = new Player();
		this.fillPlayer();
		return player;
	}

	abstract void fillPlayer();
}
