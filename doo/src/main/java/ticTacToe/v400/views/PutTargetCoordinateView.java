package ticTacToe.v400.views;

import ticTacToe.v400.controllers.CoordinateController;
import ticTacToe.v400.controllers.RandomCoordinateController;
import ticTacToe.v400.controllers.UserCoordinateController;
import ticTacToe.v400.models.Coordinate;

public class PutTargetCoordinateView extends ColocateCoordinateView {

	private Coordinate target;

	PutTargetCoordinateView(CoordinateController coordinateController) {
		super(coordinateController);
	}		
		
	Coordinate getCoordinate(){
		target = this.getCoordinateController().getTarget();
		this.getCoordinateController().accept(this);
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
