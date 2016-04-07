package ticTacToe.v460.controllers.local;

import ticTacToe.v460.models.Game;

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
