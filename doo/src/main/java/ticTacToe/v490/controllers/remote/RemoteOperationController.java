package ticTacToe.v490.controllers.remote;

import ticTacToe.v490.controllers.OperationController;
import ticTacToe.v490.controllers.OperationControllerVisitor;

public abstract class RemoteOperationController extends RemoteController
		implements OperationController {

	protected RemoteOperationController() {
	}
	
	public abstract void accept(
			OperationControllerVisitor operationControllerVisitor);

}
