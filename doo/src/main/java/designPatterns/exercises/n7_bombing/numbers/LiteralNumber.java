package designPatterns.exercises.n7_bombing.numbers;

public class LiteralNumber extends Number {

	private double value;
	
	public LiteralNumber(double value){
		this.value = value;
	}
	
	@Override
	public double eval() {
		return value;
	}

}
