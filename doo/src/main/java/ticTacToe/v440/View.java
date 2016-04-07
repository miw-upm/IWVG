package ticTacToe.v440;

import ticTacToe.v440.controllers.OperationController;
import ticTacToe.v440.controllers.OperationControllerVisitor;

public interface View extends OperationControllerVisitor {

	public void interact(OperationController operationController);
}
