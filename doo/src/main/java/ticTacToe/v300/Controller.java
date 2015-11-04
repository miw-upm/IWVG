package ticTacToe.v300;

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
	
	protected void remove(TicTacToeCoordinate coordinate) {
		game.remove(coordinate);
	}
	
	protected void clear() {
		game.clear();		
	}	
	
	protected boolean full(TicTacToeCoordinate coodinate) {
		return game.full(coodinate);
	}
	
	protected boolean existTicTacToe() {
		return game.existTicTacToe();
	}
	
	protected void put(TicTacToeCoordinate coodinate) {
		game.put(coodinate);
	}
	
	protected boolean empty(TicTacToeCoordinate coodinate) {
		return game.empty(coodinate);
	}
	
	protected Game getGame(){
		return game;
	}
	
	
}
