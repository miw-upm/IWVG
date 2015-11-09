package ticTacToe.v390.controllers;

import ticTacToe.v390.models.Color;
import ticTacToe.v390.models.Coordinate;

public interface ColocateController extends OperationController,
		PresenterController {

	Color take();

	void put(Coordinate target);

	boolean existTicTacToe();

	CoordinateController getCoordinateController();

	void accept(ColocateControllerVisitor colocateControllerVisitor);

}
