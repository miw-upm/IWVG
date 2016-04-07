package ticTacToe.v440.controllers.local;

import ticTacToe.v440.Logic;
import ticTacToe.v440.models.Game;

public class LocalLogic implements Logic {

	private Game game;
	
	private State state;

	private LocalColocateControllerBuilder colocateControllerBuilder;
	
	private LocalStartController startController;

	private LocalContinueController continueController;

	public LocalLogic() {
		state = State.INITIAL;
		game = new Game();
		colocateControllerBuilder = new LocalColocateControllerBuilder(this, game);
		startController = new LocalStartController(this, game, colocateControllerBuilder);
		continueController = new LocalContinueController(this, game);
	}
	
	void initialize() {
		assert state == State.FINAL;
		this.state = State.INITIAL;
	}
	
	void begin() {
		assert state == State.INITIAL;
		this.state = State.IN_GAME;
	}
	
	void end() {
		assert state == State.IN_GAME;
		this.state = State.FINAL;
	}
	
	void exit() {
		assert state == State.FINAL;
		this.state = State.EXIT;
	}

	public LocalOperationController getOperationController() {
		switch (state){
		case INITIAL:
			return startController;
		case IN_GAME:
			return colocateControllerBuilder.getColocateController();
		case FINAL:
			return continueController;
		case EXIT:
		default:
			return null;
		}
	}

}
