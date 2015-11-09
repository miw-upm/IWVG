package ticTacToe.v400.controllers.local;

import ticTacToe.v400.controllers.OperationController;
import ticTacToe.v400.controllers.OperationControllerVisitor;
import ticTacToe.v400.controllers.local.LocalController;
import ticTacToe.v400.models.Game;

public abstract class LocalOperationController extends LocalController
		implements OperationController {

	protected LocalOperationController(Game game) {
		super(game);
	}

	public abstract void accept(
			OperationControllerVisitor operationControllerVisitor);

}
