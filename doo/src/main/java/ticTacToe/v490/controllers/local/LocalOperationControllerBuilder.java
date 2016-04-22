package ticTacToe.v490.controllers.local;

import ticTacToe.v490.controllers.local.LocalColocateController;
import ticTacToe.v490.controllers.local.LocalColocateControllerBuilder;
import ticTacToe.v490.controllers.local.LocalContinueController;
import ticTacToe.v490.controllers.local.LocalRandomColocateControllerBuilder;
import ticTacToe.v490.controllers.local.LocalStartController;
import ticTacToe.v490.controllers.local.LocalUserColocateControllerBuilder;
import ticTacToe.v490.models.Game;
import ticTacToe.v490.models.Observer;
import ticTacToe.v490.utils.ClosedInterval;

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

	public void build() {
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

	public LocalStartController getStartController() {
		assert localStartController != null;
		return localStartController;
	}

	public LocalColocateController getColocateController() {
		assert colocateControllerBuilderArray != null;
		assert colocateControllerBuilderArray[game.take().ordinal()] != null;
		return colocateControllerBuilderArray[game.take().ordinal()]
				.getColocateController();
	}
	
	public LocalContinueController getContinueController() {
		assert localContinueController != null;
		return localContinueController;
	}
}