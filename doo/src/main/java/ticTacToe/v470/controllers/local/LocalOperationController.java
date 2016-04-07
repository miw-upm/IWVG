package ticTacToe.v470.controllers.local;

import ticTacToe.v470.controllers.OperationController;
import ticTacToe.v470.controllers.OperationControllerVisitor;
import ticTacToe.v470.controllers.local.LocalController;
import ticTacToe.v470.models.Game;

public abstract class LocalOperationController extends LocalController
		implements OperationController {

	protected LocalOperationController(Game game) {
		super(game);
	}
	
	public abstract void accept(
			OperationControllerVisitor operationControllerVisitor);

}
