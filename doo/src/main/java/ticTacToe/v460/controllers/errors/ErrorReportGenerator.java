package ticTacToe.v460.controllers.errors;

import ticTacToe.v460.models.Game;

public abstract class ErrorReportGenerator {

	public abstract ErrorReport getErrorReport(Game game);

}
