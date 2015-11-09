package ticTacToe.v270.controllers;

import ticTacToe.v270.models.Game;
import ticTacToe.v270.models.State;
import ticTacToe.v270.utils.IO;

public class ContinueController extends Controller {

	protected ContinueController(Game game) {
		super(game);
	}

	@Override
	public void control() {
		assert this.getState() == State.FINAL;
		char answer;
		do {
			answer = new IO().readChar("Desea continuar? (s/n): ");
		} while (answer != 's' && answer != 'S' && answer != 'n'
				&& answer != 'N');
		if (answer == 's' || answer == 'S') {
			this.getBoard().clear();
			this.setState(State.INITIAL);
		} else {
			this.setState(State.EXIT);
		}
	}

}
