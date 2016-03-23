package ticTacToe.v400;

import ticTacToe.v400.controllers.OperationController;
import ticTacToe.v400.controllers.OperationControllerVisitor;

public interface View extends OperationControllerVisitor {

	public void interact(OperationController operationController);
}
