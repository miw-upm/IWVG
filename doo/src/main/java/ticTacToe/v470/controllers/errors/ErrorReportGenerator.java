package ticTacToe.v470.controllers.errors;

import ticTacToe.v470.models.Game;

public abstract class ErrorReportGenerator {

	public abstract ErrorReport getErrorReport(Game game);

}
