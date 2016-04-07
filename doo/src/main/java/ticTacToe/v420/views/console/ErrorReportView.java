package ticTacToe.v420.views.console;

import java.util.List;

import ticTacToe.v420.controllers.errors.ErrorReport;
import ticTacToe.v420.controllers.errors.ErrorReportVisitor;
import ticTacToe.v420.controllers.errors.NotEmptyErrorReport;
import ticTacToe.v420.controllers.errors.NotPropertyErrorReport;
import ticTacToe.v420.controllers.errors.RepeatedCoordinateErrorReport;
import ticTacToe.v420.models.Coordinate;
import ticTacToe.v420.utils.IO;

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
		List<Coordinate> coordinateList = errorReport.getCoordinateList();
		for(int i=0; i<coordinateList.size(); i++){
			CoordinateView.instance().write(separator, coordinateList.get(i));
			if (!separator.equals(", ")) {
				separator = ", ";
			}
		}
		IO.instance().writeln();
	}

}
