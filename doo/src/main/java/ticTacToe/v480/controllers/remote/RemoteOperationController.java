package ticTacToe.v480.controllers.remote;

import ticTacToe.v480.controllers.OperationController;
import ticTacToe.v480.controllers.OperationControllerVisitor;

public abstract class RemoteOperationController extends RemoteController
		implements OperationController {

	protected RemoteOperationController() {
	}
	
	public abstract void accept(
			OperationControllerVisitor operationControllerVisitor);

}
