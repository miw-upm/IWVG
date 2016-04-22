package ticTacToe.v490.models;

import java.util.List;

public class Game {

	private Turn turn;

	private Board board;
	
	private static final int NUM_PLAYERS = 2;
	
	public Game(Observer observer) {
		turn = new Turn();
		board = new Board(Game.NUM_PLAYERS);
		board.register(observer);
	}
	
	public Color take() {
		return turn.take();
	}
	
	public void change() {
		turn.change();
	}
	
	public boolean full(Coordinate origin) {
		return board.full(origin, turn.take());
	}
	
	public boolean empty(Coordinate target) {
		return board.empty(target);
	}	
	
	public int getNumPlayers() {
		return NUM_PLAYERS;
	}
	
	public void put(Coordinate target) {
		board.put(target, turn.take());
	}

	public void remove(Coordinate origin) {
		board.remove(origin, turn.take());
	}

	public void clear() {
		board.clear();		
	}

	public boolean complete() {
		return board.complete();
	}
	
	public boolean existTicTacToe() {
		return board.existTicTacToe();
	}

	public Color getColor(Coordinate coordinate) {
		return board.getColor(coordinate);
	}
	
	public List<Coordinate> emptyCoordinates() {
		return board.emptyCoordinates();
	}
	
	public List<Coordinate> playerCoordinates() {
		return board.playerCoordinates(turn.take());
	}
	
}
