package ticTacToe.v360.controllers.local;

import ticTacToe.v360.controllers.ContinueController;
import ticTacToe.v360.controllers.OperationControllerVisitor;
import ticTacToe.v360.models.Game;
import ticTacToe.v360.models.State;

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
