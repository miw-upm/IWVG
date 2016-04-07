package ticTacToe.v420.controllers.errors;

import ticTacToe.v420.models.Game;

public class NotEmptyErrorReportGenerator extends ErrorReportGenerator {

	@Override
	public ErrorReport getErrorReport(Game game) {
		return new NotEmptyErrorReport(game.emptyCoordinates());
	}
	
}
