package ticTacToe.v490.controllers.remote;

import ticTacToe.v490.controllers.CoordinateControllerVisitor;
import ticTacToe.v490.controllers.UserCoordinateController;
import ticTacToe.v490.controllers.remote.network.ClientNetwork;
import ticTacToe.v490.models.Coordinate;

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
