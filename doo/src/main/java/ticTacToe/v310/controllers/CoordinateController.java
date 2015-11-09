package ticTacToe.v310.controllers;

import ticTacToe.v310.models.Coordinate;
import ticTacToe.v310.models.Game;

public abstract class CoordinateController extends Controller {

	protected CoordinateController(Game game) {
		super(game);
	}

	public abstract Coordinate getOrigin();
	
	public abstract Coordinate getTarget(String targetTitle);


}
