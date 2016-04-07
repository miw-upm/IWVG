package ticTacToe.v460.controllers.local;

import ticTacToe.v460.models.Game;
import ticTacToe.v460.models.Observer;
import ticTacToe.v460.utils.ClosedInterval;

public class LocalOperationControllerBuilder {

	private LocalStartController localStartController;

	private LocalColocateControllerBuilder[] colocateControllerBuilderArray;

	private LocalContinueController localContinueController;

	private Observer observer;

	private Game game;

	public LocalOperationControllerBuilder(Observer observer, Game game) {
		this.observer = observer;
		this.game = game;
	}

	void build() {
		localStartController = new LocalStartController(observer, game, this);
		colocateControllerBuilderArray = new LocalColocateControllerBuilder[game
				.getNumPlayers()];
		localContinueController = new LocalContinueController(observer, game);
	}

	void build(int users) {
		assert new ClosedInterval(0, game.getNumPlayers()).includes(users);
		for (int i = 0; i < game.getNumPlayers(); i++) {
			if (i < users) {
				colocateControllerBuilderArray[i] = new LocalUserColocateControllerBuilder(
						game);
			} else {
				colocateControllerBuilderArray[i] = new LocalRandomColocateControllerBuilder(
						game);
			}
			colocateControllerBuilderArray[i].build();
		}
	}

	public LocalStartController getLocalStartController() {
		assert localStartController != null;
		return localStartController;
	}

	public LocalColocateController getLocalColocateController() {
		assert colocateControllerBuilderArray != null;
		assert colocateControllerBuilderArray[game.take().ordinal()] != null;
		return colocateControllerBuilderArray[game.take().ordinal()]
				.getLocalColocateController();
	}
	
	public LocalContinueController getLocalContinueController() {
		assert localContinueController != null;
		return localContinueController;
	}
}