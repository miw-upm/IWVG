package ticTacToe.v320.controllers;

import ticTacToe.v320.models.Coordinate;
import ticTacToe.v320.models.Game;

public abstract class CoordinateController extends Controller {

	protected CoordinateController(Game game) {
		super(game);
	}

	public abstract Coordinate getOrigin();
	
	public abstract Coordinate getTarget();

}
