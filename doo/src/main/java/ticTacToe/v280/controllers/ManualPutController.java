package ticTacToe.v280.controllers;

import ticTacToe.v280.models.Game;
import ticTacToe.v280.models.Coordinate;

public class ManualPutController extends PutController{

	public ManualPutController(Game game) {
		super(game);
	}

	@Override
	protected Coordinate selectTarget(String targetTitle) {
		Coordinate target = new Coordinate();
		target.read(targetTitle);
		return target;
	}

}
