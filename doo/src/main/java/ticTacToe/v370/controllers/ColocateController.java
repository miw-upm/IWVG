package ticTacToe.v370.controllers;

import ticTacToe.v370.models.Color;
import ticTacToe.v370.models.Coordinate;

public interface ColocateController extends OperationController,
		PresenterController {

	Color take();

	void put(Coordinate target);

	boolean existTicTacToe();

	CoordinateController getCoordinateController();

	void accept(ColocateControllerVisitor colocateControllerVisitor);

}
