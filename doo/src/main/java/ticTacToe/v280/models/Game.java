package ticTacToe.v280.models;

public class Game {

	private State state;
	
	private Turn turn;

	private Board board;
	
	private static final int NUM_PLAYERS = 2;
	
	public Game() {
		state = State.INITIAL;
		turn = new Turn();
		board = new Board(Game.NUM_PLAYERS);
	}
	
	public State getState() {
		return state;
	}
	
	public void setState(State state){
		this.state = state;
	}
	
	public Turn getTurn() {
		return turn;
	}
	
	public Board getBoard() {
		return board;
	}
	
}
