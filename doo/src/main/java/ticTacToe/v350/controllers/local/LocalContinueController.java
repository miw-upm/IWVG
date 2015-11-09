package ticTacToe.v350.controllers.local;

import ticTacToe.v350.controllers.ContinueController;
import ticTacToe.v350.controllers.OperationControllerVisitor;
import ticTacToe.v350.models.Game;
import ticTacToe.v350.models.State;

public class LocalContinueController extends LocalOperationController implements
		ContinueController {

	LocalContinueController(Game game) {
		super(game);
	}

	public void resume(boolean another) {
		assert this.getState() == State.FINAL;
		if (another) {
			this.clear();
			this.setState(State.INITIAL);
		} else {
			this.setState(State.EXIT);
		}
	}

	@Override
	public void accept(OperationControllerVisitor operationControllerVisitor) {
		operationControllerVisitor.visit(this);
	}

}
