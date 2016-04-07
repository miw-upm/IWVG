package ticTacToe.v470.views.console;

import ticTacToe.v470.models.Coordinate;
import ticTacToe.v470.utils.IO;
import ticTacToe.v470.utils.LimitedIntDialog;

class CoordinateView {

	private static CoordinateView coordinateView;
	
	public static CoordinateView instance() {
		if (coordinateView == null) {
			coordinateView = new CoordinateView();
		}
		return coordinateView;
	}
	
	private CoordinateView() {
		
	}
	
	void read(String title, Coordinate coordinate) {
		assert title != null;
		assert coordinate != null;
		IO.instance().writeln(title + " qué casilla?");
		coordinate.setRow(LimitedIntDialog.instance().read("Fila?",
				Coordinate.DIMENSION) - 1);
		coordinate.setColumn(LimitedIntDialog.instance().read("Columna?",
				Coordinate.DIMENSION) - 1);
	}

	void write(String title, Coordinate coordinate) {
		assert title != null;
		assert coordinate != null;
		IO.instance().write(
				title + "[" + (coordinate.getRow() + 1) + ", "
						+ (coordinate.getColumn() + 1) + "]");

	}
}
