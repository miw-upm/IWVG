package ticTacToe.v480.controllers;

import ticTacToe.v480.controllers.errors.ErrorReport;
import ticTacToe.v480.models.Color;
import ticTacToe.v480.models.Coordinate;

public interface ColocateController extends OperationController,
		PresenterController {

	Color take();

	void put(Coordinate target);

	boolean existTicTacToe();

	CoordinateController getCoordinateController();
	
	ErrorReport validateTarget(Coordinate target);

	void accept(ColocateControllerVisitor colocateControllerVisitor);

}
