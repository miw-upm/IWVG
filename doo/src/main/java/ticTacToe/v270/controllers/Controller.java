package ticTacToe.v270.controllers;

import ticTacToe.v270.models.Board;
import ticTacToe.v270.models.Game;
import ticTacToe.v270.models.State;
import ticTacToe.v270.models.Turn;

public abstract class Controller {

	private Game game;

	protected Controller(Game game) {
		assert game != null;
		this.game = game;
	}
	
	public abstract void control();
	
	protected State getState(){
		return game.getState();
	}
	
	protected void setState(State state){
		assert state != null;
		game.setState(state);
	}
	
	protected Board getBoard() {
		return game.getBoard();
	}
	
	protected Turn getTurn() {
		return game.getTurn();
	}
}
