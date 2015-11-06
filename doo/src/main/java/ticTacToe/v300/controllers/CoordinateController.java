package ticTacToe.v300.controllers;

import ticTacToe.v300.models.Game;
import ticTacToe.v300.models.Coordinate;

public abstract class CoordinateController extends Controller {

	protected CoordinateController(Game game) {
		super(game);
	}

	public abstract Coordinate getOrigin();
	
	public abstract Coordinate getTarget(String targetTitle);


}
