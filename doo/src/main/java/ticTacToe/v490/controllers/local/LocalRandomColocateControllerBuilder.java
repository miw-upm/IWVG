package ticTacToe.v490.controllers.local;

import ticTacToe.v490.models.Game;

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
