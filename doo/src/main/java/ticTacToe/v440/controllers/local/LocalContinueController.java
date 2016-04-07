package ticTacToe.v440.controllers.local;

import ticTacToe.v440.controllers.ContinueController;
import ticTacToe.v440.controllers.OperationControllerVisitor;
import ticTacToe.v440.models.Game;

public class LocalContinueController extends LocalOperationController implements
		ContinueController {

	LocalContinueController(LocalLogic localLogic, Game game) {
		super(localLogic, game);
	}

	public void resume(boolean another) {
		if (another) {
			this.clear();
			this.initialize();
		} else {
			this.exit();
		}
	}

	@Override
	public void accept(OperationControllerVisitor operationControllerVisitor) {
		operationControllerVisitor.visit(this);
	}

}
