package ticTacToe.v350.controllers.local;

import ticTacToe.v350.controllers.OperationController;
import ticTacToe.v350.controllers.OperationControllerVisitor;
import ticTacToe.v350.controllers.local.LocalController;
import ticTacToe.v350.models.Game;

public abstract class LocalOperationController extends LocalController
		implements OperationController {

	protected LocalOperationController(Game game) {
		super(game);
	}

	public abstract void accept(
			OperationControllerVisitor operationControllerVisitor);

}
