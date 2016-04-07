package ticTacToe.v430.controllers.local;

import ticTacToe.v430.controllers.OperationController;
import ticTacToe.v430.controllers.OperationControllerVisitor;
import ticTacToe.v430.controllers.local.LocalController;
import ticTacToe.v430.models.Game;

public abstract class LocalOperationController extends LocalController
implements OperationController {

protected LocalOperationController(Game game) {
super(game);
}

public abstract void accept(
	OperationControllerVisitor operationControllerVisitor);

}
