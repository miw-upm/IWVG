package ticTacToe.v350.views;

import ticTacToe.v350.controllers.ContinueController;
import ticTacToe.v350.controllers.MoveController;
import ticTacToe.v350.controllers.OperationController;
import ticTacToe.v350.controllers.OperationControllerVisitor;
import ticTacToe.v350.controllers.PutController;
import ticTacToe.v350.controllers.StartController;

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
