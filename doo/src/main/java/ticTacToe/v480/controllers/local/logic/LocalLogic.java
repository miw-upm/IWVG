package ticTacToe.v480.controllers.local.logic;

import ticTacToe.v480.Logic;
import ticTacToe.v480.controllers.local.LocalOperationController;
import ticTacToe.v480.controllers.local.LocalOperationControllerBuilder;
import ticTacToe.v480.models.Game;
import ticTacToe.v480.models.Observer;

public class LocalLogic implements Logic, Observer {

	private StatesBuilder statesBuilder;

	private State actualState;

	public LocalLogic() {
		Game game = new Game(this);
		LocalOperationControllerBuilder localOperationControllerBuilder = new LocalOperationControllerBuilder(
				this, game);
		localOperationControllerBuilder.build();
		statesBuilder = new StatesBuilder(this, game,
				localOperationControllerBuilder);
		actualState = statesBuilder.getInitialState();
	}

	public void initialize() {
		actualState = actualState.initialize();
	}

	public void begin() {
		actualState = actualState.begin();
	}

	public void end() {
		actualState = actualState.end();
	}

	public void exit() {
		actualState = actualState.exit();
	}

	public LocalOperationController getOperationController() {
		return actualState.getOperationController();
	}

}
