package ticTacToe.v440.controllers.errors;

import ticTacToe.v440.models.Game;

public abstract class ErrorReportGenerator {

	public abstract ErrorReport getErrorReport(Game game);

}
