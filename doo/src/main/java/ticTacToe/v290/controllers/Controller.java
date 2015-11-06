package ticTacToe.v290.controllers;

import ticTacToe.v290.models.Board;
import ticTacToe.v290.models.Game;
import ticTacToe.v290.models.State;
import ticTacToe.v290.models.Turn;

public abstract class Controller {

	private Game game;

	protected Controller(Game game) {
		assert game != null;
		this.game = game;
	}
	
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
	
	protected Game getGame(){
		return game;
	}
}
