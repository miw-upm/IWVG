package designPatterns.exercises.n7_bombing.sentences;

import designPatterns.exercises.n7_bombing.logic.Logic;

public class While extends ConditionalCompositeSentence {

	public While(Logic condition) {
		super(condition);
	}

	@Override
	public void exec() {
		while (condition.eval()) {
			super.exec();
		} 
	}
	
	@Override
	public String toString() {
		return "\nWhile [" + super.toString() + "\n] While";
	}

}
