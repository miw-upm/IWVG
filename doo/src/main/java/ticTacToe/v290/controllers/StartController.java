package ticTacToe.v290.controllers;

import ticTacToe.v290.models.Game;
import ticTacToe.v290.models.State;
import ticTacToe.v290.utils.LimitedIntDialog;

public class StartController extends OperationController {

	private ColocateControllerBuilder colocateControllerBuilder;

	protected StartController(Game game, ColocateControllerBuilder colocateControllerBuilder) {
		super(game);
		this.colocateControllerBuilder = colocateControllerBuilder;
	}

	@Override
	public void control() {
		assert this.getState() == State.INITIAL;
		int users = new LimitedIntDialog("Cuántos usuarios?", 0, this.getGame().getNumPlayers()).read();
		colocateControllerBuilder.build(users);
		this.getBoard().write();
		this.setState(State.IN_GAME);
	}

}
