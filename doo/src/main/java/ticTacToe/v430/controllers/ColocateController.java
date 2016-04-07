package ticTacToe.v430.controllers;

import ticTacToe.v430.controllers.errors.ErrorReport;
import ticTacToe.v430.models.Color;
import ticTacToe.v430.models.Coordinate;

public interface ColocateController extends OperationController,
		PresenterController {

	Color take();

	void put(Coordinate target);

	boolean existTicTacToe();

	CoordinateController getCoordinateController();
	
	ErrorReport validateTarget(Coordinate target);

	void accept(ColocateControllerVisitor colocateControllerVisitor);

}
