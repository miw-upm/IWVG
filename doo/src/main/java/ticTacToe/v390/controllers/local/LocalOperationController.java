package ticTacToe.v390.controllers.local;

import ticTacToe.v390.controllers.OperationController;
import ticTacToe.v390.controllers.OperationControllerVisitor;
import ticTacToe.v390.controllers.local.LocalController;
import ticTacToe.v390.models.Game;

public abstract class LocalOperationController extends LocalController
		implements OperationController {

	protected LocalOperationController(Game game) {
		super(game);
	}

	public abstract void accept(
			OperationControllerVisitor operationControllerVisitor);

}
