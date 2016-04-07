package ticTacToe.v440.controllers.local;

import ticTacToe.v440.controllers.OperationController;
import ticTacToe.v440.controllers.OperationControllerVisitor;
import ticTacToe.v440.controllers.local.LocalController;
import ticTacToe.v440.models.Game;

public abstract class LocalOperationController extends LocalController
		implements OperationController {

	protected LocalOperationController(LocalLogic localLogic, Game game) {
		super(localLogic, game);
	}
	
	public abstract void accept(
			OperationControllerVisitor operationControllerVisitor);

}
