package ticTacToe.v285.controllers;

import ticTacToe.v285.models.Coordinate;
import ticTacToe.v285.models.Game;


public abstract class CoordinateController extends Controller {

	protected CoordinateController(Game game) {
		super(game);
	}

	public abstract Coordinate getOrigin();
	
	public abstract Coordinate getTarget(String targetTitle);


}
