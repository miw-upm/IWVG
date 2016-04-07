package ticTacToe.v450.controllers;

import ticTacToe.v450.controllers.errors.ErrorReport;
import ticTacToe.v450.models.Coordinate;

public interface MoveController extends ColocateController {

	ErrorReport validateOrigin(Coordinate origin);

	void remove(Coordinate origin);

	ErrorReport validateTarget(Coordinate origin, Coordinate target);

}
