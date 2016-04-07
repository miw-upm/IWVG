package ticTacToe.v420.controllers.local;

import ticTacToe.v420.controllers.OperationController;
import ticTacToe.v420.controllers.OperationControllerVisitor;
import ticTacToe.v420.controllers.local.LocalController;
import ticTacToe.v420.models.Game;

public abstract class LocalOperationController extends LocalController
		implements OperationController {

	protected LocalOperationController(Game game) {
		super(game);
	}

	public abstract void accept(
			OperationControllerVisitor operationControllerVisitor);

}
