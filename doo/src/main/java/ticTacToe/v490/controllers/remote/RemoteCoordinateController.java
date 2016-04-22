package ticTacToe.v490.controllers.remote;

import ticTacToe.v490.controllers.CoordinateController;
import ticTacToe.v490.models.Coordinate;

public abstract class RemoteCoordinateController extends RemoteController
		implements CoordinateController {

	protected RemoteCoordinateController() {
	}

	public abstract Coordinate getOrigin();

	public abstract Coordinate getTarget();

}
