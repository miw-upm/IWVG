package ticTacToe.v450.controllers.errors;

import ticTacToe.v450.models.Game;

public abstract class ErrorReportGenerator {

	public abstract ErrorReport getErrorReport(Game game);

}
