package designPatterns.exercises.n7_bombing.logic;

import designPatterns.exercises.n7_bombing.Target;

public class IsAttacking extends Logic {

	protected Target target;
	
	public IsAttacking(Target target) {
		this.target = target;
	}

	@Override
	public boolean eval() {
		return target.isAttacking();
	}

}
