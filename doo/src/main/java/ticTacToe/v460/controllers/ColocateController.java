package ticTacToe.v460.controllers;

import ticTacToe.v460.controllers.errors.ErrorReport;
import ticTacToe.v460.models.Color;
import ticTacToe.v460.models.Coordinate;

public interface ColocateController extends OperationController,
		PresenterController {

	Color take();

	void put(Coordinate target);

	boolean existTicTacToe();

	CoordinateController getCoordinateController();
	
	ErrorReport validateTarget(Coordinate target);

	void accept(ColocateControllerVisitor colocateControllerVisitor);

}
