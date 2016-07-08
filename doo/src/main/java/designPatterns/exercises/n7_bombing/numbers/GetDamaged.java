package designPatterns.exercises.n7_bombing.numbers;

import designPatterns.exercises.n7_bombing.Target;

public class GetDamaged extends Number {

	private Target target;
	
	public GetDamaged(Target target) {
		this.target = target;
	}
	
	@Override
	public double eval() {
		return target.getDamaged();
	}

}
