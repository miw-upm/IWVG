package ticTacToe.v420.controllers.errors;

import java.util.List;

import ticTacToe.v420.models.Coordinate;

public abstract class ErrorReport {

	private List<Coordinate> coordinateList;
	
	protected ErrorReport(List<Coordinate> coordinateList) {
		this.coordinateList = coordinateList;
	}
	
	public List<Coordinate> getCoordinateList() {
		return coordinateList;
	}
	
	public abstract void accept(ErrorReportVisitor errorReportVisitor);
}
