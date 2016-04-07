package ticTacToe.v460.controllers.local;

import ticTacToe.v460.controllers.ContinueController;
import ticTacToe.v460.controllers.OperationControllerVisitor;
import ticTacToe.v460.models.Game;
import ticTacToe.v460.models.Observer;
import ticTacToe.v460.models.Subject;

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
