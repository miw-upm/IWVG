package designPatterns.exercises.n7_bombing.relationals;

import designPatterns.exercises.n7_bombing.numbers.Number;

public class Equals extends BinaryOperator {

	public Equals(Number leftNumber, Number rightNumber) {
		super(leftNumber,rightNumber);
	}
	
	@Override
	public boolean eval() {
		return (leftNumber.eval() == rightNumber.eval());
	}
}
