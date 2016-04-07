package ticTacToe.v470.controllers;

import ticTacToe.v470.controllers.errors.ErrorReport;
import ticTacToe.v470.models.Coordinate;

public interface MoveController extends ColocateController {

	ErrorReport validateOrigin(Coordinate origin);

	void remove(Coordinate origin);

	ErrorReport validateTarget(Coordinate origin, Coordinate target);

}
