package ticTacToe.v460.controllers.local;

import ticTacToe.v460.models.Game;

class LocalUserColocateControllerBuilder extends
		LocalColocateControllerBuilder {

	LocalUserColocateControllerBuilder(Game game) {
		super(game);
	}

	@Override
	void build() {
		LocalCoordinateController[] localCoordinateControllerArray = {
				new LocalUserCoordinateController(game),
				new LocalUserCoordinateController(game), };
		this.build(localCoordinateControllerArray);
	}

}
