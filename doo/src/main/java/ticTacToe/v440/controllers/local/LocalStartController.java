package ticTacToe.v440.controllers.local;

import ticTacToe.v440.controllers.OperationControllerVisitor;
import ticTacToe.v440.controllers.StartController;
import ticTacToe.v440.models.Game;
import ticTacToe.v440.utils.ClosedInterval;

public class LocalStartController extends LocalOperationController implements
		StartController {

	private LocalColocateControllerBuilder colocateControllerBuilder;

	LocalStartController(LocalLogic localLogic, Game game,
			LocalColocateControllerBuilder colocateControllerBuilder) {
		super(localLogic, game);
		assert colocateControllerBuilder != null;
		this.colocateControllerBuilder = colocateControllerBuilder;
	}

	public void start(int users) {
		assert new ClosedInterval(0, this.numPlayers()).includes(users);
		colocateControllerBuilder.build(users);
		this.begin();
	}

	@Override
	public void accept(OperationControllerVisitor operationControllerVisitor) {
		operationControllerVisitor.visit(this);
	}

}
