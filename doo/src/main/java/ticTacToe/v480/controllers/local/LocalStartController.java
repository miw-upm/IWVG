package ticTacToe.v480.controllers.local;

import ticTacToe.v480.controllers.OperationControllerVisitor;
import ticTacToe.v480.controllers.StartController;
import ticTacToe.v480.models.Game;
import ticTacToe.v480.models.Observer;
import ticTacToe.v480.models.Subject;
import ticTacToe.v480.utils.ClosedInterval;

public class LocalStartController extends LocalOperationController implements
		StartController {

	private LocalOperationControllerBuilder localOperationControllerBuilder;

	private Subject subject;
	
	public LocalStartController(Observer observer, Game game,
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
