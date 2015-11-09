package ticTacToe.v310.controllers;

import ticTacToe.v310.models.Color;
import ticTacToe.v310.models.Coordinate;
import ticTacToe.v310.models.Game;
import ticTacToe.v310.models.State;

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
	
	protected Color take() {
		return game.take();
	}
	
	protected void change() {
		game.change();
	}
	
	protected void write() {
		game.write();		
	}
	
	protected void remove(Coordinate coordinate) {
		game.remove(coordinate);
	}
	
	protected void clear() {
		game.clear();		
	}	
	
	protected boolean full(Coordinate coodinate) {
		return game.full(coodinate);
	}
	
	protected boolean existTicTacToe() {
		return game.existTicTacToe();
	}
	
	protected void put(Coordinate coodinate) {
		game.put(coodinate);
	}
	
	protected boolean empty(Coordinate coodinate) {
		return game.empty(coodinate);
	}
	
	protected Game getGame(){
		return game;
	}
	
	
}
