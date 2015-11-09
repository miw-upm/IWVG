package ticTacToe.v370.controllers.local;

import ticTacToe.v370.controllers.OperationController;
import ticTacToe.v370.controllers.OperationControllerVisitor;
import ticTacToe.v370.controllers.local.LocalController;
import ticTacToe.v370.models.Game;

public abstract class LocalOperationController extends LocalController
		implements OperationController {

	protected LocalOperationController(Game game) {
		super(game);
	}

	public abstract void accept(
			OperationControllerVisitor operationControllerVisitor);

}
