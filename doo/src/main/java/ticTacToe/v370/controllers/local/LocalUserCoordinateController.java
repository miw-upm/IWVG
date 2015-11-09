package ticTacToe.v370.controllers.local;

import ticTacToe.v370.controllers.UserCoordinateController;
import ticTacToe.v370.models.Coordinate;
import ticTacToe.v370.models.Game;

public class LocalUserCoordinateController extends LocalCoordinateController
	implements UserCoordinateController {

	protected LocalUserCoordinateController(Game game) {
		super(game);
	}

	@Override
	public Coordinate getOrigin() {
		return new Coordinate();
	}

	@Override
	public Coordinate getTarget() {
		return new Coordinate();
	}
	
}
