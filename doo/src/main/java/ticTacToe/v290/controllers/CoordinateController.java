package ticTacToe.v290.controllers;

import ticTacToe.v290.models.Game;
import ticTacToe.v290.models.Coordinate;

public abstract class CoordinateController extends Controller {

	protected CoordinateController(Game game) {
		super(game);
	}

	public abstract Coordinate getOrigin();
	
	public abstract Coordinate getTarget(String targetTitle);


}
