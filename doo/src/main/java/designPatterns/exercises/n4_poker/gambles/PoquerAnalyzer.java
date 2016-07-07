package designPatterns.exercises.n4_poker.gambles;

class PoquerAnalyzer extends Analyzer {

	public PoquerAnalyzer(Analyzer analyzer){
		super(analyzer);
	}
	
	@Override
	public Gamble getGamble(PlayerStatistics playerStatistics) {
		if (playerStatistics.hasSameValue(4)) {
			return new Gamble(GambleType.POQUER, 
					playerStatistics.getOrderedValues(4));
		} else {
			return nextAnalyzer.getGamble(playerStatistics);
		}
	}

}
