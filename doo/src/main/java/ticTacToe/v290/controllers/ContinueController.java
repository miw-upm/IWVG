package ticTacToe.v290.controllers;

import ticTacToe.v290.models.Game;
import ticTacToe.v290.models.State;
import ticTacToe.v290.utils.IO;

public class ContinueController extends OperationController {

	public ContinueController(Game game) {
		super(game);
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
