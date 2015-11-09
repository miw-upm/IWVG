package ticTacToe.v330.controllers;

public interface OperationControllerVisitor {

	void visit(StartController startController);
	
	void visit(PutController putController);
	
	void visit(MoveController moveController);
	
	void visit(ContinueController continueController);

}

