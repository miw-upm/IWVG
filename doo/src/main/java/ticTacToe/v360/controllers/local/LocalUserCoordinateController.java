package ticTacToe.v360.controllers.local;

import ticTacToe.v360.controllers.UserCoordinateController;
import ticTacToe.v360.models.Coordinate;
import ticTacToe.v360.models.Game;

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
