package ticTacToe.v480.controllers.errors;

import java.util.List;

import ticTacToe.v480.models.Coordinate;

public class NotEmptyErrorReport extends ErrorReport {

	public NotEmptyErrorReport(List<Coordinate> coordinateList) {
		super(coordinateList);
	}
	
	@Override
	public void accept(ErrorReportVisitor errorReportVisitor) {
		errorReportVisitor.visit(this);
	}
}
