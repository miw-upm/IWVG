package ticTacToe.v480.controllers.remote;

import ticTacToe.v480.controllers.OperationControllerVisitor;
import ticTacToe.v480.controllers.StartController;
import ticTacToe.v480.controllers.remote.network.ClientNetwork;
import ticTacToe.v480.utils.ClosedInterval;

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
