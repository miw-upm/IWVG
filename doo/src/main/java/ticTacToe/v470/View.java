package ticTacToe.v470;

import ticTacToe.v470.controllers.OperationController;
import ticTacToe.v470.controllers.OperationControllerVisitor;

public interface View extends OperationControllerVisitor {

	public void interact(OperationController operationController);
}
