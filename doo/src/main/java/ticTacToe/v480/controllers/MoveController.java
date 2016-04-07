package ticTacToe.v480.controllers;

import ticTacToe.v480.controllers.errors.ErrorReport;
import ticTacToe.v480.models.Coordinate;

public interface MoveController extends ColocateController {

	ErrorReport validateOrigin(Coordinate origin);

	void remove(Coordinate origin);

	ErrorReport validateTarget(Coordinate origin, Coordinate target);

}
