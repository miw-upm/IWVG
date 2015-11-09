package ticTacToe.v310.controllers;

import ticTacToe.v310.models.Coordinate;
import ticTacToe.v310.models.Game;
import ticTacToe.v310.utils.IO;

public class RandomCoordinateController extends CoordinateController {

	private Coordinate origin;

	private Coordinate target;

	protected RandomCoordinateController(Game game) {
		super(game);
	}

	@Override
	public Coordinate getOrigin() {
		origin = new Coordinate();
		boolean ok;
		do {
			origin.random();
			ok = this.getGame().full(origin);
		} while (!ok);
		new IO().writeln("La máquina quita de " + origin);
		new IO().readString("Enter para continuar!");
		Coordinate result = origin;
		origin = null;
		return result;
	}

	@Override
	public Coordinate getTarget(String targetTitle) {
		target = new Coordinate();
		boolean ok;
		do {
			target.random();
			ok = this.getGame().empty(target);
			if (ok) {
				if (origin != null) {
					ok = !origin.equals(target);
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
