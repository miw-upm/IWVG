package ticTacToe.v460.controllers.local;

import ticTacToe.v460.controllers.OperationController;
import ticTacToe.v460.controllers.OperationControllerVisitor;
import ticTacToe.v460.controllers.local.LocalController;
import ticTacToe.v460.models.Game;

public abstract class LocalOperationController extends LocalController
		implements OperationController {

	protected LocalOperationController(Game game) {
		super(game);
	}
	
	public abstract void accept(
			OperationControllerVisitor operationControllerVisitor);

}
