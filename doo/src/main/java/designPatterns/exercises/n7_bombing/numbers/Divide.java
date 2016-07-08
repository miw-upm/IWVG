package designPatterns.exercises.n7_bombing.numbers;

public class Divide extends BinaryOperator {

	public Divide(Number leftNumber, Number rightNumber){
		super(leftNumber, rightNumber);
	}
	
	@Override
	public double eval() {
		return leftNumber.eval() / rightNumber.eval();
	}

}

