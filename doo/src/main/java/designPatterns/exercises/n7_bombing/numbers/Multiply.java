package designPatterns.exercises.n7_bombing.numbers;

public class Multiply extends BinaryOperator {

	public Multiply(Number leftNumber, Number rightNumber){
		super(leftNumber, rightNumber);
	}
	
	@Override
	public double eval() {
		return leftNumber.eval() * rightNumber.eval();
	}

}
