package ticTacToe.v400.views.console;

import ticTacToe.v400.View;
import ticTacToe.v400.controllers.ColocateController;
import ticTacToe.v400.controllers.ContinueController;
import ticTacToe.v400.controllers.OperationController;
import ticTacToe.v400.controllers.StartController;

public class ConsoleView implements View {
	
	private StartView startView;
	
	private GameView gameView;
	
	private ContinueView continueView;
	
	public ConsoleView(){
		startView = new StartView();
		gameView = new GameView();
		continueView = new ContinueView();
	}

	public void interact(OperationController operationController) {
		assert operationController != null;
		operationController.accept(this);
	}
	
	@Override
	public void visit(StartController startController) {
		startView.interact(startController);
	}
	
	@Override
	public void visit(ColocateController colocateController) {
		gameView.interact(colocateController);
	}

	@Override
	public void visit(ContinueController continueController) {
		continueView.interact(continueController);
	}

}
