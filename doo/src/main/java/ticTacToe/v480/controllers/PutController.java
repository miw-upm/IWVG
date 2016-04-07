package ticTacToe.v480.controllers;

import ticTacToe.v480.controllers.errors.ErrorReport;
import ticTacToe.v480.models.Coordinate;

public interface PutController extends ColocateController {

	ErrorReport validateTarget(Coordinate target);

}
