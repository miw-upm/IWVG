package designPatterns.exercises.n4_poker.gambles;

class CartaAltaAnalyzer extends Analyzer {
	
	public CartaAltaAnalyzer(){
		this(null);
	}
	
	public CartaAltaAnalyzer(Analyzer analyzer){
		super(analyzer);
	}
	
	@Override
	public Gamble getGamble(PlayerStatistics playerStatistics) {
		return new Gamble(GambleType.CARTA_ALTA, playerStatistics.getOrderedValues(1));
	}

}
