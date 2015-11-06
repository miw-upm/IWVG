package ticTacToe.v350.controllers;

import ticTacToe.v350.models.Coordinate;
import ticTacToe.v350.models.Game;

public abstract class CoordinateController extends Controller {

	protected CoordinateController(Game game) {
		super(game);
	}

	public abstract Coordinate getOrigin();

	public abstract Coordinate getTarget();
	
	public abstract void accept(CoordinateControllerVisitor coordinateControllerVisitor);

}
