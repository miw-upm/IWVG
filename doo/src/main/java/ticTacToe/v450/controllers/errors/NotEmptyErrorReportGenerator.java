package ticTacToe.v450.controllers.errors;

import ticTacToe.v450.models.Game;

public class NotEmptyErrorReportGenerator extends ErrorReportGenerator {

	@Override
	public ErrorReport getErrorReport(Game game) {
		return new NotEmptyErrorReport(game.emptyCoordinates());
	}
	
}
