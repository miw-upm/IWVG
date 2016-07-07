package designPatterns.exercises.n4_poker.gambles;

class ColorAnalyzer extends Analyzer {

	public ColorAnalyzer(Analyzer analyzer){
		super(analyzer);
	}
	
	@Override
	public Gamble getGamble(PlayerStatistics playerStatistics) {
		if (playerStatistics.hasSameColor(5)) {
			return new Gamble(GambleType.COLOR, playerStatistics.getOrderedValues());
		} else {
			return nextAnalyzer.getGamble(playerStatistics);
		}
	}

}

