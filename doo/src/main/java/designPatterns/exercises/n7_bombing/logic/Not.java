package designPatterns.exercises.n7_bombing.logic;

public class Not extends Logic{

	private Logic logic;
	
	public Not(Logic logic){
		super();
		this.logic = logic;
	}

	@Override
	public boolean eval() {
		return !logic.eval();
	}

	@Override
	public String toString() {
		return "Not [\nlogic=" + logic + "\n]";
	}
	
}
