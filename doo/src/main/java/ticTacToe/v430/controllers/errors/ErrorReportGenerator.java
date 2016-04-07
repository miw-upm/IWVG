package ticTacToe.v430.controllers.errors;

import ticTacToe.v430.models.Game;

public abstract class ErrorReportGenerator {

	public abstract ErrorReport getErrorReport(Game game);

}
