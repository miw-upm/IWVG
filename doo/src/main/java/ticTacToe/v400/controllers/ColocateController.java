package ticTacToe.v400.controllers;

import ticTacToe.v400.models.Color;
import ticTacToe.v400.models.Coordinate;

public interface ColocateController extends OperationController,
		PresenterController {

	Color take();

	void put(Coordinate target);

	boolean existTicTacToe();

	CoordinateController getCoordinateController();
	
	Error validateTarget(Coordinate target);

	void accept(ColocateControllerVisitor colocateControllerVisitor);

}
