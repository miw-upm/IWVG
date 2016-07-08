package designPatterns.exercises.n7_bombing.logic;

public class True extends Logic {

	public True() {
		super();
	}

	@Override
	public boolean eval() {
		return true;
	}

	@Override
	public String toString() {
		return "True []";
	}	

}
