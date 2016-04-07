package ticTacToe.v430.controllers.errors;

import ticTacToe.v430.models.Game;

public class RepeatedCoordinateErrorReportGenerator extends ErrorReportGenerator {

	@Override
	public ErrorReport getErrorReport(Game game) {
		return new RepeatedCoordinateErrorReport(game.emptyCoordinates());
	}

}
