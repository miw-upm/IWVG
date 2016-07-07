package designPatterns.exercises.n4_poker.gambles;

abstract class Analyzer {

	protected Analyzer nextAnalyzer;
	
	public Analyzer(Analyzer nextAnalyzer) {
		this.nextAnalyzer = nextAnalyzer;
	}

	public abstract Gamble getGamble(PlayerStatistics playerStatistics);


}
