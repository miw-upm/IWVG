package ticTacToe.v290.controllers;

import ticTacToe.v290.models.Game;
import ticTacToe.v290.models.State;
import ticTacToe.v290.utils.LimitedIntDialog;

public class StartController extends OperationController {

	private ColocateController[][] colocateControllerArray;

	protected StartController(Game game) {
		super(game);
		colocateControllerArray = new ColocateController[2][2];
	}

	@Override
	public void control() {
		assert this.getState() == State.INITIAL;
		int users = new LimitedIntDialog("Cuántos usuarios?", 0, 2).read();
		CoordinateController[][] coordinateController = new CoordinateController[2][2];
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 2; j++) {
				if (i < users) {
					coordinateController[i][j] = new UserCoordinateController(this.getGame());
				} else {
					coordinateController[i][j] = new RandomCoordinateController(this.getGame());
				}
			}
		}
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 2; j++) {
				if (j == 0) {
					colocateControllerArray[i][j] = new PutController(
							this.getGame(), coordinateController[i][j]);
				} else {
					colocateControllerArray[i][j] = new MoveController(
							this.getGame(), coordinateController[i][j]);
				}
			}
		}
		this.getBoard().write();
		this.setState(State.IN_GAME);
	}

	public ColocateController[][] getColocateControllerArray() {
		return colocateControllerArray;
	}
}
