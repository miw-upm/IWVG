package ticTacToe.v390.views;

import ticTacToe.v390.controllers.CoordinateController;
import ticTacToe.v390.controllers.CoordinateControllerVisitor;
import ticTacToe.v390.controllers.RandomCoordinateController;
import ticTacToe.v390.controllers.UserCoordinateController;
import ticTacToe.v390.models.Coordinate;
import ticTacToe.v390.utils.IO;

class MoveOriginCoordinateView implements CoordinateControllerVisitor {

	private CoordinateController coordinateController;
	
	private Coordinate origin;
	
	MoveOriginCoordinateView(CoordinateController coordinateController) {
		assert coordinateController != null;
		this.coordinateController = coordinateController;
	}
	
	Coordinate getOrigin() {
		origin = coordinateController.getOrigin();
		coordinateController.accept(this);
		return origin;
	}

	@Override
	public void visit(UserCoordinateController userCoordinateController) {
		new CoordinateView("De", origin).read();
	}

	@Override
	public void visit(RandomCoordinateController randomCoordinateController) {
		new CoordinateView("La máquina pone en ", origin).write();
		new IO().readString(". Pulse enter para continuar");
	}
	
}
