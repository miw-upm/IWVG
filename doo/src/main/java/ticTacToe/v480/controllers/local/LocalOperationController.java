package ticTacToe.v480.controllers.local;

import ticTacToe.v480.controllers.OperationController;
import ticTacToe.v480.controllers.OperationControllerVisitor;
import ticTacToe.v480.controllers.local.LocalController;
import ticTacToe.v480.models.Game;

public abstract class LocalOperationController extends LocalController
		implements OperationController {

	protected LocalOperationController(Game game) {
		super(game);
	}
	
	public abstract void accept(
			OperationControllerVisitor operationControllerVisitor);

}
