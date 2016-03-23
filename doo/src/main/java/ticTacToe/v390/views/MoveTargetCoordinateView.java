package ticTacToe.v390.views;

import ticTacToe.v390.controllers.CoordinateController;
import ticTacToe.v390.controllers.CoordinateControllerVisitor;
import ticTacToe.v390.controllers.RandomCoordinateController;
import ticTacToe.v390.controllers.UserCoordinateController;
import ticTacToe.v390.models.Coordinate;
import ticTacToe.v390.utils.IO;

class MoveTargetCoordinateView implements CoordinateControllerVisitor {

	private CoordinateController coordinateController;
	
	private Coordinate origin;
	
	private Coordinate target;

	MoveTargetCoordinateView(CoordinateController coordinateController, Coordinate origin) {
		assert coordinateController != null;
		assert origin != null;
		this.coordinateController = coordinateController;
		this.origin = origin;
	}
	
	Coordinate getTarget() {
		coordinateController.accept(this);
		return target;
	}
	
	@Override
	public void visit(UserCoordinateController userCoordinateController) {
		target = userCoordinateController.getTarget();
		new CoordinateView("A", target).read();
	}

	@Override
	public void visit(RandomCoordinateController randomCoordinateController) {
		target = randomCoordinateController.getTarget(origin);
		new CoordinateView("La máquina pone en ", target).write();
		new IO().readString(". Pulse enter para continuar");
	}
	
}
