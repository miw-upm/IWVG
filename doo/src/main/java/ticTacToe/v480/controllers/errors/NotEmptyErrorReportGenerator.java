package ticTacToe.v480.controllers.errors;

import ticTacToe.v480.models.Game;

public class NotEmptyErrorReportGenerator extends ErrorReportGenerator {

	@Override
	public ErrorReport getErrorReport(Game game) {
		return new NotEmptyErrorReport(game.emptyCoordinates());
	}
	
}
