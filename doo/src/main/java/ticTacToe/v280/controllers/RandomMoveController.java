package ticTacToe.v280.controllers;

import ticTacToe.v280.models.Game;
import ticTacToe.v280.models.Coordinate;
import ticTacToe.v280.utils.IO;

public class RandomMoveController extends MoveController {

	public RandomMoveController(Game game) {
		super(game);
	}

	@Override
	protected Coordinate selectOrigin() {
		Coordinate origin = new Coordinate();
		boolean ok;
		do {
			origin.random();
			ok = this.getGame().getBoard().full(origin, this.getTurn().take());
		} while (!ok);
		new IO().writeln("La máquina quita de " + origin);
		new IO().readString("Enter para continuar!");
		Coordinate result = origin;
		origin = null;
		return result;
	}

	@Override
	protected Coordinate selectTarget(String targetTitle) {
		Coordinate target = new Coordinate();
		boolean ok;
		do {
			target.random();
			ok = this.getGame().getBoard().empty(target);
			if (ok) {
				if (this.getOrigin() != null) {
					ok = !this.getOrigin().equals(target);
				}
			}
		} while (!ok);
		new IO().writeln("La máquina pone en " + target);
		new IO().readString("Enter para continuar!");
		Coordinate result = target;
		target = null;
		return result;
	}

}
