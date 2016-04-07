package ticTacToe.v430.controllers;

import ticTacToe.v430.controllers.errors.ErrorReport;
import ticTacToe.v430.models.Coordinate;

public interface PutController extends ColocateController {

	ErrorReport validateTarget(Coordinate target);

}
