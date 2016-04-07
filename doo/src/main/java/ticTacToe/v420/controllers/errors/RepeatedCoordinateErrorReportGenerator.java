package ticTacToe.v420.controllers.errors;

import ticTacToe.v420.models.Game;

public class RepeatedCoordinateErrorReportGenerator extends ErrorReportGenerator {

	@Override
	public ErrorReport getErrorReport(Game game) {
		return new RepeatedCoordinateErrorReport(game.emptyCoordinates());
	}

}
