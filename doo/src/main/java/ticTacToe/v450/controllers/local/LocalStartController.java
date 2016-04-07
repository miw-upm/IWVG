package ticTacToe.v450.controllers.local;

import ticTacToe.v450.controllers.OperationControllerVisitor;
import ticTacToe.v450.controllers.StartController;
import ticTacToe.v450.models.Game;
import ticTacToe.v450.models.Observer;
import ticTacToe.v450.models.Subject;
import ticTacToe.v450.utils.ClosedInterval;

public class LocalStartController extends LocalOperationController implements
		StartController {

	private LocalColocateControllerBuilder colocateControllerBuilder;

	private Subject subject;
	
	LocalStartController(Observer observer, Game game,
			LocalColocateControllerBuilder colocateControllerBuilder) {
		super(game);
		subject = new Subject();
		subject.register(observer);
		assert colocateControllerBuilder != null;
		this.colocateControllerBuilder = colocateControllerBuilder;
	}

	public void start(int users) {
		assert new ClosedInterval(0, this.numPlayers()).includes(users);
		colocateControllerBuilder.build(users);
		subject.begin();
	}

	@Override
	public void accept(OperationControllerVisitor operationControllerVisitor) {
		operationControllerVisitor.visit(this);
	}

}
