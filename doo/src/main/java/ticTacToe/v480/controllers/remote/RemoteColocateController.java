package ticTacToe.v480.controllers.remote;

import ticTacToe.v480.controllers.ColocateController;
import ticTacToe.v480.controllers.CoordinateController;
import ticTacToe.v480.controllers.errors.ErrorReport;
import ticTacToe.v480.controllers.remote.network.ClientNetwork;
import ticTacToe.v480.models.Coordinate;

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
