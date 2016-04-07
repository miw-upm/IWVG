package ticTacToe.v460.controllers.local;

import ticTacToe.v460.controllers.OperationControllerVisitor;
import ticTacToe.v460.controllers.StartController;
import ticTacToe.v460.models.Game;
import ticTacToe.v460.models.Observer;
import ticTacToe.v460.models.Subject;
import ticTacToe.v460.utils.ClosedInterval;

public class LocalStartController extends LocalOperationController implements
		StartController {

	private LocalOperationControllerBuilder localOperationControllerBuilder;

	private Subject subject;
	
	LocalStartController(Observer observer, Game game,
			LocalOperationControllerBuilder localOperationControllerBuilder) {
		super(game);
		subject = new Subject();
		subject.register(observer);
		assert localOperationControllerBuilder != null;
		this.localOperationControllerBuilder = localOperationControllerBuilder;
	}

	public void start(int users) {
		assert new ClosedInterval(0, this.numPlayers()).includes(users);
		localOperationControllerBuilder.build(users);
		subject.begin();
	}

	@Override
	public void accept(OperationControllerVisitor operationControllerVisitor) {
		operationControllerVisitor.visit(this);
	}

}
