package designPatterns.exercises.n7_bombing.numbers;

public class Subtract extends BinaryOperator {

	public Subtract(Number leftNumber, Number rightNumber){
		super(leftNumber, rightNumber);
	}
	
	@Override
	public double eval() {
		return leftNumber.eval() - rightNumber.eval();
	}

}

