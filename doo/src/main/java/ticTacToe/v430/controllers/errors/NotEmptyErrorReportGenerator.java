package ticTacToe.v430.controllers.errors;

import ticTacToe.v430.models.Game;

public class NotEmptyErrorReportGenerator extends ErrorReportGenerator {

	@Override
	public ErrorReport getErrorReport(Game game) {
		return new NotEmptyErrorReport(game.emptyCoordinates());
	}
	
}
