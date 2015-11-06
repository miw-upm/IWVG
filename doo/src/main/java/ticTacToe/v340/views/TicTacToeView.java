package ticTacToe.v340.views;

import ticTacToe.v340.controllers.ContinueController;
import ticTacToe.v340.controllers.MoveController;
import ticTacToe.v340.controllers.OperationController;
import ticTacToe.v340.controllers.OperationControllerVisitor;
import ticTacToe.v340.controllers.PutController;
import ticTacToe.v340.controllers.StartController;

public class TicTacToeView implements OperationControllerVisitor {

	public void interact(OperationController controller) {
		assert controller != null;
		controller.accept(this);
	}
	
	@Override
	public void visit(StartController startController) {
		new StartView(startController).interact();
	}
	
	public void visit(PutController putController) {
		new PutView(putController).interact();
	}

	public void visit(MoveController moveController) {
		new MoveView(moveController).interact();
	}

	public void visit(ContinueController continueController) {
		new ContinueView(continueController).interact();
	}

}
