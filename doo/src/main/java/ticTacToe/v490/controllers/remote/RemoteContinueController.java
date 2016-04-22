package ticTacToe.v490.controllers.remote;

import ticTacToe.v490.controllers.ContinueController;
import ticTacToe.v490.controllers.OperationControllerVisitor;
import ticTacToe.v490.controllers.remote.network.ClientNetwork;

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
