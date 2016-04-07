package ticTacToe.v420.controllers;

import ticTacToe.v420.controllers.errors.ErrorReport;
import ticTacToe.v420.models.Color;
import ticTacToe.v420.models.Coordinate;
import ticTacToe.v420.models.Game;

public interface ColocateController extends OperationController,
		PresenterController {

	Color take();

	void put(Coordinate target);

	boolean existTicTacToe();

	CoordinateController getCoordinateController();
	
	ErrorReport validateTarget(Coordinate target);
	
	Game getGame();

	void accept(ColocateControllerVisitor colocateControllerVisitor);

}
