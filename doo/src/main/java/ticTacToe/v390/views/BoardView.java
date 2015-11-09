package ticTacToe.v390.views;

import ticTacToe.v390.controllers.PresenterController;
import ticTacToe.v390.models.Coordinate;
import ticTacToe.v390.utils.IO;

class BoardView {

	private PresenterController controller;

	BoardView(PresenterController controller) {
		assert controller != null;
		this.controller = controller;
	}

	void write() {
		IO io = new IO();
		for (int i = 0; i < Coordinate.DIMENSION; i++) {
			for (int j = 0; j < Coordinate.DIMENSION; j++) {
				io.write(controller.getColor(new Coordinate(i, j))
						+ " ");
			}
			io.writeln();
		}
	}
}
