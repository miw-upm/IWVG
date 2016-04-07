package ticTacToe.v480;

import ticTacToe.v480.controllers.OperationController;
import ticTacToe.v480.controllers.OperationControllerVisitor;

public interface View extends OperationControllerVisitor {

	public void interact(OperationController operationController);
}
