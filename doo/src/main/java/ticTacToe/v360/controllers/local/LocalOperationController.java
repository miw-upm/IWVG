package ticTacToe.v360.controllers.local;

import ticTacToe.v360.controllers.OperationController;
import ticTacToe.v360.controllers.OperationControllerVisitor;
import ticTacToe.v360.controllers.local.LocalController;
import ticTacToe.v360.models.Game;

public abstract class LocalOperationController extends LocalController
		implements OperationController {

	protected LocalOperationController(Game game) {
		super(game);
	}

	public abstract void accept(
			OperationControllerVisitor operationControllerVisitor);

}
