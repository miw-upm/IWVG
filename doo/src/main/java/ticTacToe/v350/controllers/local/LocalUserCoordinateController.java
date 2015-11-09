package ticTacToe.v350.controllers.local;

import ticTacToe.v350.controllers.UserCoordinateController;
import ticTacToe.v350.models.Coordinate;
import ticTacToe.v350.models.Game;

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
