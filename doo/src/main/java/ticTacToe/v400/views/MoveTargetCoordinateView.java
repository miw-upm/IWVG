package ticTacToe.v400.views;

import ticTacToe.v400.controllers.CoordinateController;
import ticTacToe.v400.controllers.RandomCoordinateController;
import ticTacToe.v400.controllers.UserCoordinateController;
import ticTacToe.v400.models.Coordinate;

public class MoveTargetCoordinateView extends ColocateCoordinateView {

	private CoordinateController coordinateController;
	
	private Coordinate origin;
	
	private Coordinate target;

	MoveTargetCoordinateView(CoordinateController coordinateController, Coordinate origin) {
		assert coordinateController != null;
		assert origin != null;
		this.coordinateController = coordinateController;
		this.origin = origin;
	}
	
	Coordinate getCoordinate() {
		coordinateController.accept(this);
		return target;
	}
	
	@Override
	public void visit(UserCoordinateController userCoordinateController) {
		target = userCoordinateController.getTarget();
		new CoordinateView("A", target).interact();
	}

	@Override
	public void visit(RandomCoordinateController randomCoordinateController) {
		target = randomCoordinateController.getTarget(origin);
		this.show("pone en", target);
	}
	
}
