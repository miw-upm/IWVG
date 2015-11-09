package ticTacToe.v380.controllers.local;

import ticTacToe.v380.controllers.OperationController;
import ticTacToe.v380.controllers.OperationControllerVisitor;
import ticTacToe.v380.controllers.local.LocalController;
import ticTacToe.v380.models.Game;

public abstract class LocalOperationController extends LocalController
		implements OperationController {

	protected LocalOperationController(Game game) {
		super(game);
	}

	public abstract void accept(
			OperationControllerVisitor operationControllerVisitor);

}
