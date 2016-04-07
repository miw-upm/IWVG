package ticTacToe.v470.controllers.local;

import ticTacToe.v470.models.Game;

class LocalRandomColocateControllerBuilder extends
		LocalColocateControllerBuilder {

	LocalRandomColocateControllerBuilder(Game game) {
		super(game);
	}

	@Override
	void build() {
		LocalCoordinateController[] localCoordinateControllerArray = {
				new LocalRandomCoordinateController(game),
				new LocalRandomCoordinateController(game), };
		this.build(localCoordinateControllerArray);
	}
}
