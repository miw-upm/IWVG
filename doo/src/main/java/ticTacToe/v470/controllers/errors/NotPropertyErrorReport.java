package ticTacToe.v470.controllers.errors;

import java.util.List;

import ticTacToe.v470.models.Coordinate;

public class NotPropertyErrorReport extends ErrorReport {

	public NotPropertyErrorReport(List<Coordinate> coordinateList) {
		super(coordinateList);
	}
	
	@Override
	public void accept(ErrorReportVisitor errorReportVisitor) {
		errorReportVisitor.visit(this);
	}
}
