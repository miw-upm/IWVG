package ticTacToe.v480.controllers.remote;

import ticTacToe.v480.controllers.CoordinateController;
import ticTacToe.v480.models.Coordinate;

public abstract class RemoteCoordinateController extends RemoteController
		implements CoordinateController {

	protected RemoteCoordinateController() {
	}

	public abstract Coordinate getOrigin();

	public abstract Coordinate getTarget();

}
