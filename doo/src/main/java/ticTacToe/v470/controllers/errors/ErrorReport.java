package ticTacToe.v470.controllers.errors;

import java.util.Iterator;
import java.util.List;

import ticTacToe.v470.models.Coordinate;

public abstract class ErrorReport {

	private List<Coordinate> coordinateList;
	
	protected ErrorReport(List<Coordinate> coordinateList) {
		this.coordinateList = coordinateList;
	}
	
	public Iterator<Coordinate> iterator() {
		return coordinateList.iterator();
	}
	
	public abstract void accept(ErrorReportVisitor errorReportVisitor);
}
