package ticTacToe.v420.controllers.errors;

import java.util.List;

import ticTacToe.v420.models.Coordinate;

public class NotPropertyErrorReport extends ErrorReport {

	public NotPropertyErrorReport(List<Coordinate> coordinateList) {
		super(coordinateList);
	}
	
	@Override
	public void accept(ErrorReportVisitor errorReportVisitor) {
		errorReportVisitor.visit(this);
	}
}
