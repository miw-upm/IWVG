package ticTacToe.v490.controllers.local;

import ticTacToe.v490.controllers.OperationControllerVisitor;
import ticTacToe.v490.controllers.StartController;
import ticTacToe.v490.models.Game;
import ticTacToe.v490.models.Observer;
import ticTacToe.v490.models.Subject;
import ticTacToe.v490.utils.ClosedInterval;

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
