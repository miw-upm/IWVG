package ticTacToe.v310.views;

import ticTacToe.v310.models.Coordinate;
import ticTacToe.v310.utils.IO;

class CoordinateView {
	
	private String title;
	
	private Coordinate ticTacToeCoordinate;
	
	CoordinateView(String title, Coordinate ticTacToeCoordinate) {
		assert title != null;
		assert ticTacToeCoordinate != null;
		this.title = title;
		this.ticTacToeCoordinate = ticTacToeCoordinate;
	}

	void interact() {
		new IO().writeln(title + " qué casilla?");
		ticTacToeCoordinate.setRow(new LimitedIntDialog("Fila?", Coordinate.DIMENSION)
				.read() - 1);
		ticTacToeCoordinate.setColumn(new LimitedIntDialog("Columna?",
				Coordinate.DIMENSION).read() - 1);
	}
}
