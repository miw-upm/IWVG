package ticTacToe.v490.controllers;

import ticTacToe.v490.controllers.errors.ErrorReport;
import ticTacToe.v490.models.Coordinate;

public interface MoveController extends ColocateController {

	ErrorReport validateOrigin(Coordinate origin);

	void remove(Coordinate origin);

	ErrorReport validateTarget(Coordinate origin, Coordinate target);

}
