package designPatterns.exercises.n4_poker.gambles;

import java.util.ArrayList;
import java.util.List;

import designPatterns.exercises.n4_poker.cards.Value;

class EscaleraAnalyzer extends Analyzer {

	public EscaleraAnalyzer(Analyzer analyzer){
		super(analyzer);
	}
	
	@Override
	public Gamble getGamble(PlayerStatistics playerStatistics) {
		if (playerStatistics.hasStair()) {
			List<Value> orderedValues = new ArrayList<Value>();
			orderedValues.add(playerStatistics.getMaxValue());
			return new Gamble(GambleType.ESCALERA, orderedValues);
		} else {
			return nextAnalyzer.getGamble(playerStatistics);
		}
	}

}
