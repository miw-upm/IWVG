package ticTacToe.v400.views;

import ticTacToe.v400.controllers.CoordinateController;
import ticTacToe.v400.controllers.RandomCoordinateController;
import ticTacToe.v400.controllers.UserCoordinateController;
import ticTacToe.v400.models.Coordinate;

public class PutCoordinateView extends ColocateCoordinateView {

	private CoordinateController coordinateController;

	private Coordinate target;

	PutCoordinateView(CoordinateController coordinateController) {
		assert coordinateController != null;
		this.coordinateController = coordinateController;
	}		
		
	Coordinate getCoordinate(){
		target = coordinateController.getTarget();
		coordinateController.accept(this);
		return target;
	}

	@Override
	public void visit(UserCoordinateController userCoordinateController) {
		new CoordinateView("En", target).interact();
	}

	@Override
	public void visit(RandomCoordinateController randomCoordinateController) {
		this.show("pone en", target);
	}

}
