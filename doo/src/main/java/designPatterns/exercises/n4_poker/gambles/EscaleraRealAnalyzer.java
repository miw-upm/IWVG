package designPatterns.exercises.n4_poker.gambles;

import java.util.ArrayList;
import java.util.List;

import designPatterns.exercises.n4_poker.cards.Value;

class EscaleraRealAnalyzer extends Analyzer {

	public EscaleraRealAnalyzer(Analyzer analyzer){
		super(analyzer);
	}
	
	@Override
	public Gamble getGamble(PlayerStatistics playerStatistics) {
		if (playerStatistics.hasSameColor(5)
				&& playerStatistics.hasStairStart(Value.DIEZ)) {
			List<Value> orderedValues = new ArrayList<Value>();
			orderedValues.add(playerStatistics.getMaxValue());
			return new Gamble(GambleType.ESCALERA_REAL, orderedValues);
		} else {
			return nextAnalyzer.getGamble(playerStatistics);
		}
	}

}
