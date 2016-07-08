package designPatterns.exercises.n7_bombing.relationals;

import designPatterns.exercises.n7_bombing.numbers.Number;

public class Greater extends BinaryOperator {

	public Greater(Number leftNumber, Number rightNumber) {
		super(leftNumber,rightNumber);
	}
	
	@Override
	public boolean eval() {
		return (leftNumber.eval() > rightNumber.eval());
	}
}
