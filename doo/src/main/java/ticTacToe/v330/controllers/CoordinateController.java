package ticTacToe.v330.controllers;

import ticTacToe.v330.models.Game;
import ticTacToe.v330.models.Coordinate;

public abstract class CoordinateController extends Controller {

	protected CoordinateController(Game game) {
		super(game);
	}

	public abstract Coordinate getOrigin();
	
	public abstract Coordinate getTarget();

}
