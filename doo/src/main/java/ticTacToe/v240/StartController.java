package ticTacToe.v240;

public class StartController extends GameController {

	protected StartController(Game game){
		super(game);
	}
	
	public void control() {
		assert this.getState() == State.INITIAL;
		this.getBoard().write();
		this.setState(State.IN_GAME);
	}

}
