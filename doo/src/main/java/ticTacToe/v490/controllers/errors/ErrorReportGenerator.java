package ticTacToe.v490.controllers.errors;

import ticTacToe.v490.models.Game;

public abstract class ErrorReportGenerator {

	public abstract ErrorReport getErrorReport(Game game);

}
