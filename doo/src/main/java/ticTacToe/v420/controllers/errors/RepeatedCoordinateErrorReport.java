package ticTacToe.v420.controllers.errors;

import java.util.List;

import ticTacToe.v420.models.Coordinate;

public class RepeatedCoordinateErrorReport extends ErrorReport {

	public RepeatedCoordinateErrorReport(List<Coordinate> coordinateList) {
		super(coordinateList);
	}
	
	@Override
	public void accept(ErrorReportVisitor errorReportVisitor) {
		errorReportVisitor.visit(this);
	}
}
