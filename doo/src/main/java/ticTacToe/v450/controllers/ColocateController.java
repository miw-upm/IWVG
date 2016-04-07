package ticTacToe.v450.controllers;

import ticTacToe.v450.controllers.errors.ErrorReport;
import ticTacToe.v450.models.Color;
import ticTacToe.v450.models.Coordinate;

public interface ColocateController extends OperationController,
		PresenterController {

	Color take();

	void put(Coordinate target);

	boolean existTicTacToe();

	CoordinateController getCoordinateController();
	
	ErrorReport validateTarget(Coordinate target);

	void accept(ColocateControllerVisitor colocateControllerVisitor);

}
