package ticTacToe.v490.controllers.errors;

import ticTacToe.v490.models.Game;

public class NotPropertyErrorReportGenerator extends ErrorReportGenerator {
	
	@Override
	public ErrorReport getErrorReport(Game game) {
		return new NotEmptyErrorReport(game.playerCoordinates());
	}

}
