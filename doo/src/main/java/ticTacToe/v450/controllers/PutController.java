package ticTacToe.v450.controllers;

import ticTacToe.v450.controllers.errors.ErrorReport;
import ticTacToe.v450.models.Coordinate;

public interface PutController extends ColocateController {

	ErrorReport validateTarget(Coordinate target);

}
