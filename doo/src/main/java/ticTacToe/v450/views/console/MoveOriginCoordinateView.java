package ticTacToe.v450.views.console;

import ticTacToe.v450.controllers.CoordinateController;
import ticTacToe.v450.controllers.RandomCoordinateController;
import ticTacToe.v450.controllers.UserCoordinateController;
import ticTacToe.v450.models.Coordinate;

class MoveOriginCoordinateView extends ColocateCoordinateView {

	private Coordinate origin;
	
	MoveOriginCoordinateView(CoordinateController coordinateController) {
		super(coordinateController);
	}
	
	Coordinate getCoordinate() {
		origin = this.getCoordinateController().getOrigin();
		this.getCoordinateController().accept(this);
		return origin;
	}

	@Override
	public void visit(UserCoordinateController userCoordinateController) {
		CoordinateView.instance().read("De", origin);
	}

	@Override
	public void visit(RandomCoordinateController randomCoordinateController) {
		this.show("quita de", origin);
	}
	
}
