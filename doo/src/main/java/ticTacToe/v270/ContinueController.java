package ticTacToe.v270;

public class ContinueController extends OperationController {

	public ContinueController(Game game) {
		super(game);
	}

	public void setContinue(boolean answer){
		assert this.getState() == State.FINAL;
		if (answer) {
			this.getBoard().clear();
			this.setState(State.INITIAL);
		} else {
			this.setState(State.EXIT);
		}
	}
	
	@Override
	public void control() {
		assert this.getState() == State.FINAL;
		IO io = new IO();
		char answer;
		do {
			answer = io.readChar("Desea continuar? (s/n): ");
		} while (answer != 's' && answer != 'S' && answer != 'n'
				&& answer != 'N');
		if (answer == 's') {
			this.getBoard().clear();
			this.setState(State.INITIAL);
		} else {
			this.setState(State.EXIT);
		}
	}

}
