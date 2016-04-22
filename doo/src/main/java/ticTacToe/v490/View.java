package ticTacToe.v490;

import ticTacToe.v490.controllers.OperationController;
import ticTacToe.v490.controllers.OperationControllerVisitor;

public interface View extends OperationControllerVisitor {

	public void interact(OperationController operationController);
}
