package ticTacToe.v280.controllers;

import ticTacToe.v280.models.Game;
import ticTacToe.v280.models.Coordinate;
import ticTacToe.v280.utils.IO;

public class RandomPutController extends PutController {

	public RandomPutController(Game game) {
		super(game);
	}

	@Override
	protected Coordinate selectTarget(String targetTitle) {
		Coordinate target = new Coordinate();
		boolean ok;
		do {
			target.random();
			ok = this.getGame().getBoard().empty(target);
		} while (!ok);
		new IO().writeln("La máquina pone en " + target);
		new IO().readString("Enter para continuar!");
		Coordinate result = target;
		target = null;
		return result;
	}

}
