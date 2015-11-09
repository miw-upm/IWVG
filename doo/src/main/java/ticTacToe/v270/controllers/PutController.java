package ticTacToe.v270.controllers;

import ticTacToe.v270.models.Game;

public class PutController extends ColocateController {

	public PutController(Game game) {
		super(game, "Pone");
	}

	@Override
	protected void colocate() {
		this.put("En");
	}

}
