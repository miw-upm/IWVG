package ticTacToe.v480.controllers.remote;

import ticTacToe.v480.controllers.ContinueController;
import ticTacToe.v480.controllers.OperationControllerVisitor;
import ticTacToe.v480.controllers.remote.network.ClientNetwork;

public class RemoteContinueController extends RemoteOperationController
		implements ContinueController {

	public void resume(boolean resume) {
		ClientNetwork.instance().send(ControllerFrameType.RESUME, resume);
	}

	@Override
	public void accept(OperationControllerVisitor operationControllerVisitor) {
		operationControllerVisitor.visit(this);
	}

}
