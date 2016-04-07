package ticTacToe.v470.controllers;

import ticTacToe.v470.controllers.errors.ErrorReport;
import ticTacToe.v470.models.Color;
import ticTacToe.v470.models.Coordinate;

public interface ColocateController extends OperationController,
		PresenterController {

	Color take();

	void put(Coordinate target);

	boolean existTicTacToe();

	CoordinateController getCoordinateController();
	
	ErrorReport validateTarget(Coordinate target);

	void accept(ColocateControllerVisitor colocateControllerVisitor);

}
