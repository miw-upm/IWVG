package ticTacToe.v470.controllers.local;

import ticTacToe.v470.controllers.OperationControllerVisitor;
import ticTacToe.v470.controllers.StartController;
import ticTacToe.v470.models.Game;
import ticTacToe.v470.models.Observer;
import ticTacToe.v470.models.Subject;
import ticTacToe.v470.utils.ClosedInterval;

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
