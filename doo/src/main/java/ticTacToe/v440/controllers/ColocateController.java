package ticTacToe.v440.controllers;

import ticTacToe.v440.controllers.errors.ErrorReport;
import ticTacToe.v440.models.Color;
import ticTacToe.v440.models.Coordinate;

public interface ColocateController extends OperationController,
		PresenterController {

	Color take();

	void put(Coordinate target);

	boolean existTicTacToe();

	CoordinateController getCoordinateController();
	
	ErrorReport validateTarget(Coordinate target);

	void accept(ColocateControllerVisitor colocateControllerVisitor);

}
