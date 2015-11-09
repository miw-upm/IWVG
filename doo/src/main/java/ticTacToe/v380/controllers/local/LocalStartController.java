package ticTacToe.v380.controllers.local;

import ticTacToe.v380.controllers.OperationControllerVisitor;
import ticTacToe.v380.controllers.StartController;
import ticTacToe.v380.models.Game;
import ticTacToe.v380.models.State;
import ticTacToe.v380.utils.ClosedInterval;

public class LocalStartController extends LocalOperationController implements
		StartController {

	private LocalColocateControllerBuilder colocateControllerBuilder;

	LocalStartController(Game game,
			LocalColocateControllerBuilder colocateControllerBuilder) {
		super(game);
		assert colocateControllerBuilder != null;
		this.colocateControllerBuilder = colocateControllerBuilder;
	}

	public void start(int users) {
		assert new ClosedInterval(0, this.numPlayers()).includes(users);
		assert this.getState() == State.INITIAL;
		colocateControllerBuilder.build(users);
		this.setState(State.IN_GAME);
	}

	@Override
	public void accept(OperationControllerVisitor operationControllerVisitor) {
		operationControllerVisitor.visit(this);
	}

}
