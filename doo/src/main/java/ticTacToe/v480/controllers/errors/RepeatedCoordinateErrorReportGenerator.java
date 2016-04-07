package ticTacToe.v480.controllers.errors;

import ticTacToe.v480.models.Game;

public class RepeatedCoordinateErrorReportGenerator extends ErrorReportGenerator {

	@Override
	public ErrorReport getErrorReport(Game game) {
		return new RepeatedCoordinateErrorReport(game.emptyCoordinates());
	}

}
