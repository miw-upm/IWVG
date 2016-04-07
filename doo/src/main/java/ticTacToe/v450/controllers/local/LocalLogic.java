package ticTacToe.v450.controllers.local;

import ticTacToe.v450.Logic;
import ticTacToe.v450.models.Game;
import ticTacToe.v450.models.Observer;

public class LocalLogic implements Logic, Observer  {

	private Game game;
	
	private State state;

	private LocalColocateControllerBuilder colocateControllerBuilder;
	
	private LocalStartController startController;

	private LocalContinueController continueController;

	public LocalLogic() {
		state = State.INITIAL;
		game = new Game(this);
		colocateControllerBuilder = new LocalColocateControllerBuilder(game);
		startController = new LocalStartController(this, game, colocateControllerBuilder);
		continueController = new LocalContinueController(this, game);
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
