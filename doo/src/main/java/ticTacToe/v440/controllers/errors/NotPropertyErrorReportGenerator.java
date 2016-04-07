package ticTacToe.v440.controllers.errors;

import ticTacToe.v440.models.Game;

public class NotPropertyErrorReportGenerator extends ErrorReportGenerator {
	
	@Override
	public ErrorReport getErrorReport(Game game) {
		return new NotEmptyErrorReport(game.playerCoordinates());
	}

}
