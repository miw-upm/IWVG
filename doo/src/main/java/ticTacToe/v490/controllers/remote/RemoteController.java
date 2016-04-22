package ticTacToe.v490.controllers.remote;

import ticTacToe.v490.models.Color;
import ticTacToe.v490.models.Coordinate;

public class RemoteController {

	protected int numPlayers() {
		return 0;
	}
	
	public Color take() {
		return null;
	}
	
	public void put(Coordinate target) {
		assert target != null;
	}
	
	public void remove(Coordinate origin) {
		assert origin != null;
	}
	
	public void clear() {	
	}	
	
	public boolean empty(Coordinate coordinate) {
		assert coordinate != null;
		return false;
	}
	
	public boolean full(Coordinate coordinate) {
		assert coordinate != null;
		return false;
	}
	
	public boolean existTicTacToe() {
		return false;
	}	
	
	public Color getColor(Coordinate coordinate){
		assert coordinate != null;
		return null;
	}
	
}
