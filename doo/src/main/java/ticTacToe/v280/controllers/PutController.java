package ticTacToe.v280.controllers;

import ticTacToe.v280.models.Game;

public abstract class PutController extends ColocateController {

	public PutController(Game game) {
		super(game, "Pone");
	}

	@Override
	protected void colocate() {
		this.put("En");
	}

}
