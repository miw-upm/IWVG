package ticTacToe.v450.controllers.local;

import ticTacToe.v450.controllers.OperationController;
import ticTacToe.v450.controllers.OperationControllerVisitor;
import ticTacToe.v450.controllers.local.LocalController;
import ticTacToe.v450.models.Game;

public abstract class LocalOperationController extends LocalController
		implements OperationController {

	protected LocalOperationController(Game game) {
		super(game);
	}
	
	public abstract void accept(
			OperationControllerVisitor operationControllerVisitor);

}
