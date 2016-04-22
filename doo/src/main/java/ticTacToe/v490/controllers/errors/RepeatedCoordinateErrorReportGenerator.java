package ticTacToe.v490.controllers.errors;

import ticTacToe.v490.models.Game;

public class RepeatedCoordinateErrorReportGenerator extends ErrorReportGenerator {

	@Override
	public ErrorReport getErrorReport(Game game) {
		return new RepeatedCoordinateErrorReport(game.emptyCoordinates());
	}

}
