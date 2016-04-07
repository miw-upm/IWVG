package ticTacToe.v480.controllers.errors;

import ticTacToe.v480.models.Game;

public abstract class ErrorReportGenerator {

	public abstract ErrorReport getErrorReport(Game game);

}
