package ticTacToe.v270.controllers;

import ticTacToe.v270.models.Game;
import ticTacToe.v270.models.State;

public class StartController extends Controller {

	protected StartController(Game game){
		super(game);
	}
	
	public void control() {
		assert this.getState() == State.INITIAL;
		this.getBoard().write();
		this.setState(State.IN_GAME);
	}

}
