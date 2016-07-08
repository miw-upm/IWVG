package designPatterns.exercises.n7_bombing.logic;

public class And extends BinaryOperator {

	public And(Logic leftLogic, Logic rightLogic) {
		super(leftLogic, rightLogic);
	}
	
	@Override
	public boolean eval() {
		if (leftLogic.eval()) {
			return rightLogic.eval();
		}
		return false;
	}

	@Override
	public String toString() {
		return "And [" + super.toString() + "\n] And";
	}
	
}
