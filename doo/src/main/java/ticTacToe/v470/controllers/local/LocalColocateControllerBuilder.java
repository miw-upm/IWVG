package ticTacToe.v470.controllers.local;

import ticTacToe.v470.models.Game;

abstract class LocalColocateControllerBuilder {

	protected Game game;

	protected LocalColocateController[] colocateControllerArray;

	protected LocalColocateControllerBuilder(Game game) {
		assert game != null;
		this.game = game;
		colocateControllerArray = new LocalColocateController[2];
	}

	abstract void build();

	void build(LocalCoordinateController[] localCoordinateControllerArray) {
		assert localCoordinateControllerArray != null;
		for (int i = 0; i < 2; i++) {
			assert localCoordinateControllerArray[i] != null;
		}
		colocateControllerArray[0] = new LocalPutController(game,
				localCoordinateControllerArray[0]);
		colocateControllerArray[1] = new LocalMoveController(game,
				localCoordinateControllerArray[1]);
	}

	LocalColocateController getLocalColocateController() {
		assert colocateControllerArray != null;
		for (int i = 0; i < 2; i++) {
			assert colocateControllerArray[i] != null;
		}
		if (!game.complete()) {
			return colocateControllerArray[0];
		} else {
			return colocateControllerArray[1];
		}
	}
}
