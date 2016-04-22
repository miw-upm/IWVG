package ticTacToe.v490.controllers;

import ticTacToe.v490.controllers.errors.ErrorReport;
import ticTacToe.v490.models.Coordinate;

public interface PutController extends ColocateController {

	ErrorReport validateTarget(Coordinate target);

}
