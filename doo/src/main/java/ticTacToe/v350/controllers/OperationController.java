package ticTacToe.v350.controllers;

import ticTacToe.v350.models.Color;
import ticTacToe.v350.models.Coordinate;

public interface OperationController {

	void accept(OperationControllerVisitor operationControllerVisitor);
	
	Color getColor(Coordinate coordinate);
}

