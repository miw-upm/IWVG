package ticTacToe.v290.controllers;

import ticTacToe.v290.models.Game;

public class PutController extends ColocateController {

	public PutController(Game game, CoordinateController coordinateController) {
		super(game, "Pone", coordinateController);
	}

	@Override
	protected void colocate() {
		this.put("En");
	}

}
