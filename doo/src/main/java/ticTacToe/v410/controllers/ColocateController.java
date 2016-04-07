package ticTacToe.v410.controllers;

import ticTacToe.v410.models.Color;
import ticTacToe.v410.models.Coordinate;

public interface ColocateController extends OperationController,
		PresenterController {

	Color take();

	void put(Coordinate target);

	boolean existTicTacToe();

	CoordinateController getCoordinateController();
	
	Error validateTarget(Coordinate target);

	void accept(ColocateControllerVisitor colocateControllerVisitor);

}
