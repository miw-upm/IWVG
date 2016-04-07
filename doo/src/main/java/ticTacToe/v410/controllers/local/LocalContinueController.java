package ticTacToe.v410.controllers.local;

import ticTacToe.v410.controllers.ContinueController;
import ticTacToe.v410.controllers.OperationControllerVisitor;
import ticTacToe.v410.models.Game;
import ticTacToe.v410.models.State;

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
