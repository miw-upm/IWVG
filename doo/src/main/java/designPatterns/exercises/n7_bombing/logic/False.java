package designPatterns.exercises.n7_bombing.logic;

public class False extends Logic {

	public False() {
		super();
	}

	@Override
	public boolean eval() {
		return false;
	}
	
	@Override
	public String toString() {
		return "False []";
	}

}