package designPatterns.exercises.n4_poker.players;

import java.util.ArrayList;
import java.util.List;

import designPatterns.exercises.n4_poker.cards.Card;
import designPatterns.exercises.n4_poker.cards.Value;
import designPatterns.exercises.n4_poker.gambles.Gamble;
import designPatterns.exercises.n4_poker.gambles.GambleAnalyzer;
import designPatterns.exercises.n4_poker.gambles.PlayerStatistics;

public class Player {

	private List<Card> cardList;

	private Gamble gamble;

	public Player() {
		cardList = new ArrayList<Card>();
	}

	public void add(Card card) {
		cardList.add(card);
	}
	
	public Player whoIsWinner(Player player) {
		Gamble winner = this.getGamble().whoIsWinner(player.getGamble());
		if (winner == this.getGamble()) {
			return this;
		} else if (winner == player.getGamble()) {
			return player;
		} else {
			return null;
		}
	}
	
	private Gamble getGamble(){
		if (gamble == null){
			gamble = GambleAnalyzer.instance().getGamble(new PlayerStatistics(cardList));
		}
		return gamble;
	}

	public void show() {
		System.out.println("-------------------");
		System.out.println("Player: " + this.toString());
		
		PlayerStatistics playerStatistics = new PlayerStatistics(cardList);
		System.out.println("getMaxValue(); " + playerStatistics.getMaxValue());
		System.out.println("getOrderedValues(); " + playerStatistics.getOrderedValues());
		for (int i = 1; i <= 5; i++) {
			System.out.println("hasSameValue(" + i + "); "
					+ playerStatistics.hasSameValue(i));
			System.out.println("getOrderedValues(" + i + "); "
					+ playerStatistics.getOrderedValues(i));
		}
		for (int i = 1; i <= 5; i++) {
			System.out.println("hasSameColor(" + i + "); "
					+ playerStatistics.hasSameColor(i));
		}
		System.out.println("hasTwoPairs(); " + playerStatistics.hasTwoPairs());
		for (Value value : Value.values()) {
			if (Value.INFANTE.greater(value)) {
				System.out.println("hasStairStart(" + value.getTitle() + "); "
						+ playerStatistics.hasStairStart(value));
			}
		}
		System.out.println("hasStair(); " + playerStatistics.hasStair());
	}

	@Override
	public String toString() {
		return "Player [\ncardList=" + cardList  
				+ ", \ngamble=" + gamble
				+ "]";
	}

}
