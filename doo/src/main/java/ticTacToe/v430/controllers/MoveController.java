package ticTacToe.v430.controllers;

import ticTacToe.v430.controllers.errors.ErrorReport;
import ticTacToe.v430.models.Coordinate;

public interface MoveController extends ColocateController {

	ErrorReport validateOrigin(Coordinate origin);

	void remove(Coordinate origin);

	ErrorReport validateTarget(Coordinate origin, Coordinate target);

}
