package designPatterns.exercises.n4_poker.gambles;

import java.util.List;

import designPatterns.exercises.n4_poker.cards.Value;

class DobleParejaAnalyzer extends Analyzer {

	public DobleParejaAnalyzer(Analyzer analyzer){
		super(analyzer);
	}
	
	@Override
	public Gamble getGamble(PlayerStatistics playerStatistics) {
		if (playerStatistics.hasTwoPairs()) {
			List<Value> orderedValues = playerStatistics.getOrderedValues(2);
			orderedValues.addAll(playerStatistics.getOrderedValues(1));
			return new Gamble(GambleType.DOBLE_PAREJA, orderedValues);
		} else {
			return nextAnalyzer.getGamble(playerStatistics);
		}
	}

}
