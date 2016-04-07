package ticTacToe.v480.controllers.remote;

import ticTacToe.v480.controllers.ColocateControllerVisitor;
import ticTacToe.v480.controllers.MoveController;
import ticTacToe.v480.controllers.OperationControllerVisitor;
import ticTacToe.v480.controllers.errors.ErrorReport;
import ticTacToe.v480.controllers.remote.network.ClientNetwork;
import ticTacToe.v480.models.Coordinate;

public class RemoteMoveController extends RemoteColocateController implements
		MoveController {

	private Coordinate origin;

	@Override
	public void remove(Coordinate origin) {
		assert origin != null;
		assert this.validateOrigin(origin) == null;
		this.origin = origin;
		ClientNetwork.instance().send(ControllerFrameType.REMOVE, origin);
	}

	public ErrorReport validateOrigin(Coordinate origin) {
		assert origin != null;
		return (ErrorReport) ClientNetwork.instance().sendReceive(
				ControllerFrameType.VALIDATE_ORIGIN, origin);
	}

	@Override
	public void put(Coordinate target) {
		assert target != null;
		assert origin != null;
		assert this.validateTarget(origin, target) == null;
		ClientNetwork.instance().send(ControllerFrameType.PUT, origin);
	}

	public ErrorReport validateTarget(Coordinate origin, Coordinate target) {
		return (ErrorReport) ClientNetwork.instance().sendReceive(
				ControllerFrameType.VALIDATE_TARGET, origin, target);
	}

	@Override
	public void accept(OperationControllerVisitor operationControllerVisitor) {
		operationControllerVisitor.visit(this);
	}

	@Override
	public void accept(ColocateControllerVisitor colocateControllerVisitor) {
		colocateControllerVisitor.visit(this);
	}

}
