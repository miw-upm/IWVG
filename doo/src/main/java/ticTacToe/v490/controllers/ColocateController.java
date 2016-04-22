package ticTacToe.v490.controllers;

import ticTacToe.v490.controllers.errors.ErrorReport;
import ticTacToe.v490.models.Color;
import ticTacToe.v490.models.Coordinate;

public interface ColocateController extends OperationController,
		PresenterController {

	Color take();

	void put(Coordinate target);

	boolean existTicTacToe();

	CoordinateController getCoordinateController();
	
	ErrorReport validateTarget(Coordinate target);

	void accept(ColocateControllerVisitor colocateControllerVisitor);

}
