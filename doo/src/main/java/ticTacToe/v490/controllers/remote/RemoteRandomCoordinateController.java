package ticTacToe.v490.controllers.remote;

import ticTacToe.v490.controllers.CoordinateControllerVisitor;
import ticTacToe.v490.controllers.RandomCoordinateController;
import ticTacToe.v490.models.Coordinate;

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
