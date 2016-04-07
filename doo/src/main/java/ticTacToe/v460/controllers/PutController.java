package ticTacToe.v460.controllers;

import ticTacToe.v460.controllers.errors.ErrorReport;
import ticTacToe.v460.models.Coordinate;

public interface PutController extends ColocateController {

	ErrorReport validateTarget(Coordinate target);

}
