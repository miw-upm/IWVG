package designPatterns.exercises.n7_bombing.numbers;

public abstract class BinaryOperator extends Number {

	protected Number leftNumber;
	
	protected Number rightNumber;
	
	public BinaryOperator(Number leftNumber, Number rightNumber){
		this.leftNumber = leftNumber;
		this.rightNumber = rightNumber;
	}

}

