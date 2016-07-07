package designPatterns.exercises.n4_poker.gambles;

import java.util.List;

import designPatterns.exercises.n4_poker.cards.Value;

class TrioAnalyzer extends Analyzer {

	public TrioAnalyzer(Analyzer analyzer){
		super(analyzer);
	}
	
	@Override
	public Gamble getGamble(PlayerStatistics playerStatistics) {
		if (playerStatistics.hasSameValue(3)) {
			List<Value> orderedValues = playerStatistics.getOrderedValues(3);
//			orderedValues.addAll(playerStatistics.getOrderedValues(1));
			return new Gamble(GambleType.TRIO, orderedValues);
		} else {
			return nextAnalyzer.getGamble(playerStatistics);
		}
	}

}
