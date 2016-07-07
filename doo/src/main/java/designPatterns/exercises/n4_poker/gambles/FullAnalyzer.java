package designPatterns.exercises.n4_poker.gambles;

class FullAnalyzer extends Analyzer {

	public FullAnalyzer(Analyzer analyzer){
		super(analyzer);
	}
	
	@Override
	public Gamble getGamble(PlayerStatistics playerStatistics) {
		if (playerStatistics.hasSameValue(3) && 
				playerStatistics.hasSameValue(2)) {
			return new Gamble(GambleType.FULL, 
					playerStatistics.getOrderedValues(3));
		} else {
			return nextAnalyzer.getGamble(playerStatistics);
		}
	}

}
