package designPatterns.exercises.n7_bombing.logic;

public abstract class BinaryOperator extends Logic {

	protected Logic leftLogic;
	
	protected Logic rightLogic;
	
	public BinaryOperator(Logic leftLogic, Logic rightLogic) {
		super();
		this.leftLogic = leftLogic;
		this.rightLogic = rightLogic;
	}

	@Override
	public String toString() {
		return "\nleftLogic=" + leftLogic + "\nrightLogic=" + rightLogic;
	}
}
