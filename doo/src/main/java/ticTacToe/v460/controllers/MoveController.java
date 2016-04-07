package ticTacToe.v460.controllers;

import ticTacToe.v460.controllers.errors.ErrorReport;
import ticTacToe.v460.models.Coordinate;

public interface MoveController extends ColocateController {

	ErrorReport validateOrigin(Coordinate origin);

	void remove(Coordinate origin);

	ErrorReport validateTarget(Coordinate origin, Coordinate target);

}
