package ticTacToe.v400.controllers;

public interface ColocateControllerVisitor {

	void visit(PutController putController);
	
	void visit(MoveController moveController);
}
