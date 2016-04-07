package ticTacToe.v430;

import ticTacToe.v430.controllers.OperationController;
import ticTacToe.v430.controllers.OperationControllerVisitor;

public interface View extends OperationControllerVisitor {

	public void interact(OperationController operationController);
}
