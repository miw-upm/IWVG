package ticTacToe.v460.controllers;

public interface CoordinateControllerVisitor {

	void visit(UserCoordinateController userCoordinateController);
	
	void visit(RandomCoordinateController randomCoordinateController);
}
