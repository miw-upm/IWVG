package ticTacToe.v420.controllers.errors;

import ticTacToe.v420.models.Game;

public abstract class ErrorReportGenerator {

	public abstract ErrorReport getErrorReport(Game game);

}
