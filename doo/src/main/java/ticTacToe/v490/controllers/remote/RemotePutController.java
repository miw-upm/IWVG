package ticTacToe.v490.controllers.remote;

import ticTacToe.v490.controllers.ColocateControllerVisitor;
import ticTacToe.v490.controllers.OperationControllerVisitor;
import ticTacToe.v490.controllers.PutController;
import ticTacToe.v490.controllers.errors.ErrorReport;
import ticTacToe.v490.controllers.remote.network.ClientNetwork;
import ticTacToe.v490.models.Coordinate;

public class RemotePutController extends RemoteColocateController implements
		PutController {

	@Override
	public void put(Coordinate target) {
		assert this.validateTarget(target) == null;
		ClientNetwork.instance().send(ControllerFrameType.PUT, target);
	}

	public ErrorReport validateTarget(Coordinate target) {
		return (ErrorReport) ClientNetwork.instance().sendReceive(ControllerFrameType.VALIDATE_TARGET, target);
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
