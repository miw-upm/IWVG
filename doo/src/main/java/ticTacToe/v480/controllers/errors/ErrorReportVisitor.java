package ticTacToe.v480.controllers.errors;

public interface ErrorReportVisitor {

	void visit(NotEmptyErrorReport notEmptyErrorReport);
	
	void visit(NotPropertyErrorReport notPropertyErrorReport);
	
	void visit(RepeatedCoordinateErrorReport repeatedCoordinateErrorReport);
}
