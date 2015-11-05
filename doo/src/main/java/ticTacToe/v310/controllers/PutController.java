package ticTacToe.v310.controllers;

import ticTacToe.v310.models.Error;
import ticTacToe.v310.models.Game;
import ticTacToe.v310.models.Coordinate;

public class PutController extends ColocateController {

	PutController(Game game, CoordinateController coordinateController) {
		super(game, coordinateController);
	}

	@Override
	public void put(Coordinate target) {
		assert this.validateTarget(target) == null;
		super.put(target);
	}
	
	public Error validateTarget(Coordinate target) {
		return super.validateTarget(target);
	}
}
