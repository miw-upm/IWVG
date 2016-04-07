package ticTacToe.v420.controllers;

import ticTacToe.v420.controllers.errors.ErrorReport;
import ticTacToe.v420.models.Coordinate;

public interface MoveController extends ColocateController {

	ErrorReport validateOrigin(Coordinate origin);

	void remove(Coordinate origin);

	ErrorReport validateTarget(Coordinate origin, Coordinate target);

}
