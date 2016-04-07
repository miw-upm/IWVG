package ticTacToe.v480.controllers.remote;

import ticTacToe.v480.controllers.CoordinateControllerVisitor;
import ticTacToe.v480.controllers.UserCoordinateController;
import ticTacToe.v480.controllers.remote.network.ClientNetwork;
import ticTacToe.v480.models.Coordinate;

public class RemoteUserCoordinateController extends RemoteCoordinateController
	implements UserCoordinateController {

	@Override
	public Coordinate getOrigin() {
		return (Coordinate) ClientNetwork.instance().sendReceive(ControllerFrameType.GET_ORIGIN);
	}

	@Override
	public Coordinate getTarget() {
		return (Coordinate) ClientNetwork.instance().sendReceive(ControllerFrameType.GET_TARGET);
	}

	@Override
	public void accept(CoordinateControllerVisitor coordinateControllerVisitor) {
		coordinateControllerVisitor.visit(this);
	}
	
}
