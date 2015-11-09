package ticTacToe.v380.controllers;

import ticTacToe.v380.models.Color;
import ticTacToe.v380.models.Coordinate;

public interface ColocateController extends OperationController,
		PresenterController {

	Color take();

	void put(Coordinate target);

	boolean existTicTacToe();

	CoordinateController getCoordinateController();

	void accept(ColocateControllerVisitor colocateControllerVisitor);

}
