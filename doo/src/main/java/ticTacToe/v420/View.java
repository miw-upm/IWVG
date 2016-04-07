package ticTacToe.v420;

import ticTacToe.v420.controllers.OperationController;
import ticTacToe.v420.controllers.OperationControllerVisitor;

public interface View extends OperationControllerVisitor {

	public void interact(OperationController operationController);
}
