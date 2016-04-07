package ticTacToe.v450.controllers.local;

import ticTacToe.v450.controllers.ContinueController;
import ticTacToe.v450.controllers.OperationControllerVisitor;
import ticTacToe.v450.models.Game;
import ticTacToe.v450.models.Observer;
import ticTacToe.v450.models.Subject;

public class LocalContinueController extends LocalOperationController implements
		ContinueController {

	private Subject subject;
	
	LocalContinueController(Observer observer, Game game) {
		super(game);
		subject = new Subject();
		subject.register(observer);
	}

	public void resume(boolean another) {
		if (another) {
			this.clear();
			subject.initialize();
		} else {
			subject.exit();
		}
	}

	@Override
	public void accept(OperationControllerVisitor operationControllerVisitor) {
		operationControllerVisitor.visit(this);
	}

}
