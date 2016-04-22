package ticTacToe.v490.controllers.remote;

import ticTacToe.v490.controllers.OperationControllerVisitor;
import ticTacToe.v490.controllers.StartController;
import ticTacToe.v490.controllers.remote.network.ClientNetwork;
import ticTacToe.v490.utils.ClosedInterval;

public class RemoteStartController extends RemoteOperationController implements
		StartController {

	public void start(int users) {
		assert new ClosedInterval(0, this.numPlayers()).includes(users);
		ClientNetwork.instance().send(ControllerFrameType.START);
	}

	@Override
	public void accept(OperationControllerVisitor operationControllerVisitor) {
		operationControllerVisitor.visit(this);
	}

}
