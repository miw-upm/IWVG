package ticTacToe.v470.controllers;

import ticTacToe.v470.controllers.errors.ErrorReport;
import ticTacToe.v470.models.Coordinate;

public interface PutController extends ColocateController {

	ErrorReport validateTarget(Coordinate target);

}
