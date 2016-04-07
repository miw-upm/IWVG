package ticTacToe.v450;

import ticTacToe.v450.controllers.OperationController;
import ticTacToe.v450.controllers.OperationControllerVisitor;

public interface View extends OperationControllerVisitor {

	public void interact(OperationController operationController);
}
