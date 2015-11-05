package ticTacToe.v320.controllers;

import ticTacToe.v320.models.Game;
import ticTacToe.v320.utils.ClosedInterval;

class ColocateControllerBuilder {

	private ColocateController[][] colocateControllerArray;

	private Game game;

	ColocateControllerBuilder(Game game) {
		this.game = game;
		colocateControllerArray = new ColocateController[game.getNumPlayers()][2];
	}

	void build(int users) {
		assert new ClosedInterval(0, game.numPlayers()).includes(users);
		CoordinateController[][] coordinateController = new CoordinateController[2][2];
		for (int i = 0; i < game.getNumPlayers(); i++) {
			for (int j = 0; j < 2; j++) {
				if (i < users) {
					coordinateController[i][j] = new UserCoordinateController(
							game);
				} else {
					coordinateController[i][j] = new RandomCoordinateController(
							game);
				}
			}
		}
		for (int i = 0; i < game.getNumPlayers(); i++) {
			for (int j = 0; j < 2; j++) {
				if (j == 0) {
					colocateControllerArray[i][j] = new PutController(game,
							coordinateController[i][j]);
				} else {
					colocateControllerArray[i][j] = new MoveController(game,
							coordinateController[i][j]);
				}
			}
		}
	}

	ColocateController getColocateController() {
		int player = game.take().ordinal();
		if (!game.complete()) {
			return colocateControllerArray[player][0];
		} else {
			return colocateControllerArray[player][1];
		}
	}
}
