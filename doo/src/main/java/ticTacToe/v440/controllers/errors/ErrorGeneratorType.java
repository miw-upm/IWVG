package ticTacToe.v440.controllers.errors;

import ticTacToe.v440.models.Game;

public enum ErrorGeneratorType {
	
	NOT_EMPTY(new NotEmptyErrorReportGenerator()),
	REPEATED_COORDINATE(new RepeatedCoordinateErrorReportGenerator()),
	NOT_PROPERTY(new NotPropertyErrorReportGenerator());
	
	private ErrorReportGenerator errorReportGenerator;
	
	private ErrorGeneratorType(ErrorReportGenerator errorReportGenerator){
		this.errorReportGenerator = errorReportGenerator;
	}
	
	public ErrorReport getErrorReport(Game game) {
		return errorReportGenerator.getErrorReport(game);
	}
}
