package designPatterns.exercises.n7_bombing.relationals;

import designPatterns.exercises.n7_bombing.logic.Logic;
import designPatterns.exercises.n7_bombing.numbers.Number;

public abstract class BinaryOperator extends Logic {

	protected Number leftNumber;
	
	protected Number rightNumber;
	
	protected BinaryOperator(Number leftNumber, Number rightNumber) {
		this.leftNumber = leftNumber;
		this.rightNumber = rightNumber;
	}
	
}
