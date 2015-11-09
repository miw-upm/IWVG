package ticTacToe.v360.controllers;

import ticTacToe.v360.models.Color;
import ticTacToe.v360.models.Coordinate;

public interface ColocateController extends OperationController,
		PresenterController {

	Color take();

	void put(Coordinate target);

	boolean existTicTacToe();

	CoordinateController getCoordinateController();

}
