package ticTacToe.v340.controllers;

import ticTacToe.v340.models.Coordinate;
import ticTacToe.v340.models.Game;

public abstract class CoordinateController extends Controller {

	protected CoordinateController(Game game) {
		super(game);
	}

	public abstract Coordinate getOrigin();
	
	public abstract Coordinate getTarget();

}
