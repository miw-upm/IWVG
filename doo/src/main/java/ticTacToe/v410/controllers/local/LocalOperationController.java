package ticTacToe.v410.controllers.local;

import ticTacToe.v410.controllers.OperationController;
import ticTacToe.v410.controllers.OperationControllerVisitor;
import ticTacToe.v410.controllers.local.LocalController;
import ticTacToe.v410.models.Game;

public abstract class LocalOperationController extends LocalController
		implements OperationController {

	protected LocalOperationController(Game game) {
		super(game);
	}

	public abstract void accept(
			OperationControllerVisitor operationControllerVisitor);

}
