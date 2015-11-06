package ticTacToe.v300.controllers;

import ticTacToe.v300.models.Game;

public class PutController extends ColocateController {

	public PutController(Game game, CoordinateController coordinateController) {
		super(game, "Pone", coordinateController);
	}

	@Override
	protected void colocate() {
		this.put("En");
	}

}
