package ticTacToe.v440.controllers.local;

import ticTacToe.v440.models.Color;
import ticTacToe.v440.models.Coordinate;
import ticTacToe.v440.models.Game;

public abstract class LocalController {

	private LocalLogic localLogic;
	
	private Game game;

	protected LocalController(LocalLogic localLogic, Game game) {
		assert localLogic != null;
		assert game != null;
		this.localLogic = localLogic;
		this.game = game;
	}
	
	protected Game getGame() {
		return game;
	}
	
	protected void initialize() {
		localLogic.initialize();
	}
	
	protected void begin() {
		localLogic.begin();
	}
	
	protected void end() {
		localLogic.end();
	}
	
	protected void exit() {
		localLogic.exit();
	}
	
	protected int numPlayers() {
		return game.getNumPlayers();
	}
	
	public Color take() {
		return game.take();
	}
	
	public void put(Coordinate target) {
		assert target != null;
		game.put(target);
		if (game.existTicTacToe()) {
			this.end();
		} else {
			game.change();
		}
	}
	
	public void remove(Coordinate origin) {
		assert origin != null;
		game.remove(origin);
	}
	
	public void clear() {
		game.clear();		
	}	
	
	public boolean empty(Coordinate coordinate) {
		assert coordinate != null;
		return game.empty(coordinate);
	}
	
	public boolean full(Coordinate coordinate) {
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
