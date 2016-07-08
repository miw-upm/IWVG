package designPatterns.exercises.n7_bombing.logic;

public class Or extends BinaryOperator {

	public Or(Logic leftLogic, Logic rightLogic) {
		super(leftLogic, rightLogic);
	}
	
	@Override
	public boolean eval() {
		if (leftLogic.eval()) {
			return true;
		}
		return rightLogic.eval();
	}

	@Override
	public String toString() {
		return "Or [" + super.toString() + "\n] Or";
	}
	
}
