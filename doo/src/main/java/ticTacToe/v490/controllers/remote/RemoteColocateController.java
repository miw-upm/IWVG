package ticTacToe.v490.controllers.remote;

import ticTacToe.v490.controllers.ColocateController;
import ticTacToe.v490.controllers.CoordinateController;
import ticTacToe.v490.controllers.errors.ErrorReport;
import ticTacToe.v490.controllers.remote.network.ClientNetwork;
import ticTacToe.v490.models.Coordinate;

abstract class RemoteColocateController extends RemoteOperationController
		implements ColocateController {

	public ErrorReport validateTarget(Coordinate target) {
		return (ErrorReport) ClientNetwork.instance().sendReceive(
				ControllerFrameType.VALIDATE_TARGET, target);
	}

	public CoordinateController getCoordinateController() {
		return (CoordinateController) ClientNetwork.instance().sendReceive(
				ControllerFrameType.GET_COORDINATE_CONTROLLER);
	}

}
