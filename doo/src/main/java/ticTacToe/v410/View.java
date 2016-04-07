package ticTacToe.v410;

import ticTacToe.v410.controllers.OperationController;
import ticTacToe.v410.controllers.OperationControllerVisitor;

public interface View extends OperationControllerVisitor {

	public void interact(OperationController operationController);
}
