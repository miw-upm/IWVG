package ticTacToe.v440.controllers;

import ticTacToe.v440.controllers.errors.ErrorReport;
import ticTacToe.v440.models.Coordinate;

public interface PutController extends ColocateController {

	ErrorReport validateTarget(Coordinate target);

}
