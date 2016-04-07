package ticTacToe.v480.controllers.remote;

import ticTacToe.v480.controllers.CoordinateControllerVisitor;
import ticTacToe.v480.controllers.RandomCoordinateController;
import ticTacToe.v480.models.Coordinate;

public class RemoteRandomCoordinateController extends RemoteCoordinateController
	implements RandomCoordinateController{

	protected RemoteRandomCoordinateController() {
	}

	@Override
	public Coordinate getOrigin() {
		return null;
	}

	@Override
	public Coordinate getTarget() {
		return null;
	}
	
	public Coordinate getTarget(Coordinate origin) {
		assert origin != null;
		return null;
	}

	@Override
	public void accept(CoordinateControllerVisitor coordinateControllerVisitor) {
		coordinateControllerVisitor.visit(this);
	}

}
