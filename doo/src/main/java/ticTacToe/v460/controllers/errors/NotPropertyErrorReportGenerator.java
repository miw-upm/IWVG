package ticTacToe.v460.controllers.errors;

import ticTacToe.v460.models.Game;

public class NotPropertyErrorReportGenerator extends ErrorReportGenerator {
	
	@Override
	public ErrorReport getErrorReport(Game game) {
		return new NotEmptyErrorReport(game.playerCoordinates());
	}

}
