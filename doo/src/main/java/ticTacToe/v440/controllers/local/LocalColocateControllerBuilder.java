package ticTacToe.v440.controllers.local;

import ticTacToe.v440.models.Game;
import ticTacToe.v440.utils.ClosedInterval;

class LocalColocateControllerBuilder {

	private LocalColocateController[][] colocateControllerArray;

	private LocalLogic localLogic;

	private Game game;

	LocalColocateControllerBuilder(LocalLogic localLogic, Game game) {
		this.localLogic = localLogic;
		this.game = game;
		colocateControllerArray = new LocalColocateController[game
				.getNumPlayers()][2];
	}

	void build(int users) {
		assert new ClosedInterval(0, game.getNumPlayers()).includes(users);
		LocalCoordinateController[][] coordinateController = new LocalCoordinateController[2][2];
		for (int i = 0; i < game.getNumPlayers(); i++) {
			for (int j = 0; j < 2; j++) {
				if (i < users) {
					coordinateController[i][j] = new LocalUserCoordinateController(
							localLogic, game);
				} else {
					coordinateController[i][j] = new LocalRandomCoordinateController(
							localLogic, game);
				}
			}
		}
		for (int i = 0; i < game.getNumPlayers(); i++) {
			for (int j = 0; j < 2; j++) {
				if (j == 0) {
					colocateControllerArray[i][j] = new LocalPutController(
							localLogic, game, coordinateController[i][j]);
				} else {
					colocateControllerArray[i][j] = new LocalMoveController(
							localLogic, game, coordinateController[i][j]);
				}
			}
		}
	}

	LocalColocateController getColocateController() {
		int player = game.take().ordinal();
		if (!game.complete()) {
			return colocateControllerArray[player][0];
		} else {
			return colocateControllerArray[player][1];
		}
	}
}
