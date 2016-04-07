package ticTacToe.v420.controllers;

import ticTacToe.v420.controllers.errors.ErrorReport;
import ticTacToe.v420.models.Coordinate;

public interface PutController extends ColocateController {

	ErrorReport validateTarget(Coordinate target);

}
