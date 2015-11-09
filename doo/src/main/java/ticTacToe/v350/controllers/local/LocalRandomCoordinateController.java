package ticTacToe.v350.controllers.local;

import ticTacToe.v350.controllers.RandomCoordinateController;
import ticTacToe.v350.models.Coordinate;
import ticTacToe.v350.models.Game;

public class LocalRandomCoordinateController extends LocalCoordinateController
		implements RandomCoordinateController {

	protected LocalRandomCoordinateController(Game game) {
		super(game);
	}

	@Override
	public Coordinate getOrigin() {
		Coordinate origin = new Coordinate();
		boolean ok;
		do {
			origin.random();
			ok = this.full(origin);
		} while (!ok);
		return origin;
	}

	@Override
	public Coordinate getTarget() {
		Coordinate target = new Coordinate();
		boolean ok;
		do {
			target.random();
			ok = this.empty(target);
		} while (!ok);
		return target;
	}

	public Coordinate getTarget(Coordinate origin) {
		assert origin != null;
		boolean ok;
		Coordinate target;
		do {
			target = this.getTarget();
			ok = !origin.equals(target);
		} while (!ok);
		return target;
	}

}
