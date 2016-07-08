package designPatterns.exercises.n7_bombing.sentences;

import designPatterns.exercises.n7_bombing.logic.Logic;

public abstract class ConditionalCompositeSentence extends CompositeSentence {

	protected Logic condition;

	public ConditionalCompositeSentence(Logic condition) {
		super();
		this.condition = condition;
	}

	@Override
	public String toString() {
		return "\ncondition=" + condition + super.toString();
	}

}
