package ticTacToe.v400.views;

import ticTacToe.v400.controllers.CoordinateController;
import ticTacToe.v400.controllers.RandomCoordinateController;
import ticTacToe.v400.controllers.UserCoordinateController;
import ticTacToe.v400.models.Coordinate;

public class MoveOriginCoordinateView extends ColocateCoordinateView {

	private CoordinateController coordinateController;
	
	private Coordinate origin;
	
	MoveOriginCoordinateView(CoordinateController coordinateController) {
		assert coordinateController != null;
		this.coordinateController = coordinateController;
	}
	
	Coordinate getCoordinate() {
		origin = coordinateController.getOrigin();
		coordinateController.accept(this);
		return origin;
	}

	@Override
	public void visit(UserCoordinateController userCoordinateController) {
		new CoordinateView("De", origin).interact();
	}

	@Override
	public void visit(RandomCoordinateController randomCoordinateController) {
		this.show("quita de", origin);
	}
	
}
