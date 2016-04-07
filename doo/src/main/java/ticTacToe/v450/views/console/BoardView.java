package ticTacToe.v450.views.console;

import ticTacToe.v450.controllers.PresenterController;
import ticTacToe.v450.models.Coordinate;
import ticTacToe.v450.utils.IO;

class BoardView {

	void write(PresenterController controller) {
		assert controller != null;
		for (int i = 0; i < Coordinate.DIMENSION; i++) {
			for (int j = 0; j < Coordinate.DIMENSION; j++) {
				ColorView.instance().write(" ", controller.getColor(new Coordinate(i, j)));
			}
			IO.instance().writeln();
		}
	}
}
