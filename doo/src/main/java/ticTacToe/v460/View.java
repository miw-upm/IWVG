package ticTacToe.v460;

import ticTacToe.v460.controllers.OperationController;
import ticTacToe.v460.controllers.OperationControllerVisitor;

public interface View extends OperationControllerVisitor {

	public void interact(OperationController operationController);
}
