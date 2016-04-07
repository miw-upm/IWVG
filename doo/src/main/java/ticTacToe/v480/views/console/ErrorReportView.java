package ticTacToe.v480.views.console;

import java.util.Iterator;

import ticTacToe.v480.controllers.errors.ErrorReport;
import ticTacToe.v480.controllers.errors.ErrorReportVisitor;
import ticTacToe.v480.controllers.errors.NotEmptyErrorReport;
import ticTacToe.v480.controllers.errors.NotPropertyErrorReport;
import ticTacToe.v480.controllers.errors.RepeatedCoordinateErrorReport;
import ticTacToe.v480.models.Coordinate;
import ticTacToe.v480.utils.IO;

class ErrorReportView implements ErrorReportVisitor {

	public void write(ErrorReport errorReport) {
		errorReport.accept(this);
	}

	@Override
	public void visit(NotEmptyErrorReport notEmptyErrorReport) {
		this.write("Esa casilla ya está ocupada", notEmptyErrorReport);
	}

	@Override
	public void visit(NotPropertyErrorReport notPropertyErrorReport) {
		this.write("Esa casilla no está ocupada por ninguna de tus fichas",
				notPropertyErrorReport);
	}

	@Override
	public void visit(
			RepeatedCoordinateErrorReport repeteadCoordinateErrorReport) {
		this.write("No se puede poner de donde se quitó",
				repeteadCoordinateErrorReport);
	}

	private void write(String message, ErrorReport errorReport) {
		String separator = message + ". Puedes optar por: ";
		Iterator<Coordinate> coordinateIterator = errorReport.iterator();
		while (coordinateIterator.hasNext()){
			CoordinateView.instance().write(separator, coordinateIterator.next());
			if (!separator.equals(", ")) {
				separator = ", ";
			}
		}
		IO.instance().writeln();
	}

}
