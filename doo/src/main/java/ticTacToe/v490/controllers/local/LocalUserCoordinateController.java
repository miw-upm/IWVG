package ticTacToe.v490.controllers.local;

import ticTacToe.v490.controllers.CoordinateControllerVisitor;
import ticTacToe.v490.controllers.UserCoordinateController;
import ticTacToe.v490.models.Coordinate;
import ticTacToe.v490.models.Game;

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

	@Override
	public void accept(CoordinateControllerVisitor coordinateControllerVisitor) {
		coordinateControllerVisitor.visit(this);
	}
	
}
