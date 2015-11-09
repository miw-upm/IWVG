package ticTacToe.v340.controllers;

import ticTacToe.v340.models.Color;
import ticTacToe.v340.models.Coordinate;
import ticTacToe.v340.models.Game;
import ticTacToe.v340.models.State;

public abstract class Controller {

	private Game game;

	protected Controller(Game game) {
		assert game != null;
		this.game = game;
	}
	
	protected int numPlayers() {
		return game.numPlayers();
	}
	
	protected State getState(){
		return game.getState();
	}
	
	protected void setState(State state){
		assert state != null;
		game.setState(state);
	}
	
	public Color take() {
		return game.take();
	}
	
	protected void put(Coordinate target) {
		assert target != null;
		game.put(target);
		if (game.existTicTacToe()) {
			game.setState(State.FINAL);
		} else {
			game.change();
		}
	}
	
	protected void remove(Coordinate origin) {
		assert origin != null;
		game.remove(origin);
	}
	
	protected void clear() {
		game.clear();		
	}	
	
	protected boolean empty(Coordinate coordinate) {
		assert coordinate != null;
		return game.empty(coordinate);
	}
	
	protected boolean full(Coordinate coordinate) {
		assert coordinate != null;
		return game.full(coordinate);
	}
	
	public boolean existTicTacToe() {
		return game.existTicTacToe();
	}	
	
	public Color getColor(Coordinate coordinate){
		assert coordinate != null;
		return game.getColor(coordinate);
	}
	
}
