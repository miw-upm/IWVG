package designPatterns.exercises.n7_bombing.numbers;

public class Add extends BinaryOperator {

	public Add(Number leftNumber, Number rightNumber){
		super(leftNumber, rightNumber);
	}
	
	@Override
	public double eval() {
		return leftNumber.eval() + rightNumber.eval();
	}

}
