package ticTacToe.v440.controllers;

import ticTacToe.v440.controllers.errors.ErrorReport;
import ticTacToe.v440.models.Coordinate;

public interface MoveController extends ColocateController {

	ErrorReport validateOrigin(Coordinate origin);

	void remove(Coordinate origin);

	ErrorReport validateTarget(Coordinate origin, Coordinate target);

}
