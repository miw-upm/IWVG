package ticTacToe.v440.controllers.local;

import ticTacToe.v440.controllers.CoordinateControllerVisitor;
import ticTacToe.v440.controllers.UserCoordinateController;
import ticTacToe.v440.models.Coordinate;
import ticTacToe.v440.models.Game;

public class LocalUserCoordinateController extends LocalCoordinateController
	implements UserCoordinateController {

	protected LocalUserCoordinateController(LocalLogic localLogic, Game game) {
		super(localLogic, game);
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
