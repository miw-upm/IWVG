package ticTacToe.v460.controllers.local;

import ticTacToe.v460.Logic;
import ticTacToe.v460.models.Game;
import ticTacToe.v460.models.Observer;

public class LocalLogic implements Logic, Observer {

	private Game game;

	private State state;

	private LocalOperationControllerBuilder localOperationControllerBuilder;

	public LocalLogic() {
		state = State.INITIAL;
		game = new Game(this);
		localOperationControllerBuilder = new LocalOperationControllerBuilder(
				this, game);
		localOperationControllerBuilder.build();
	}

	public void initialize() {
		assert state == State.FINAL;
		this.state = State.INITIAL;
	}

	public void begin() {
		assert state == State.INITIAL;
		this.state = State.IN_GAME;
	}

	public void end() {
		assert state == State.IN_GAME;
		this.state = State.FINAL;
	}

	public void exit() {
		assert state == State.FINAL;
		this.state = State.EXIT;
	}

	public LocalOperationController getOperationController() {
		switch (state) {
		case INITIAL:
			return localOperationControllerBuilder.getLocalStartController();
		case IN_GAME:
			return localOperationControllerBuilder.getLocalColocateController();
		case FINAL:
			return localOperationControllerBuilder.getLocalContinueController();
		case EXIT:
		default:
			return null;
		}
	}

}
