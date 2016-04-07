package ticTacToe.v450.controllers.errors;

import java.util.List;

import ticTacToe.v450.models.Coordinate;

public class NotPropertyErrorReport extends ErrorReport {

	public NotPropertyErrorReport(List<Coordinate> coordinateList) {
		super(coordinateList);
	}
	
	@Override
	public void accept(ErrorReportVisitor errorReportVisitor) {
		errorReportVisitor.visit(this);
	}
}
