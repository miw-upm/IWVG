package designPatterns.exercises.n7_bombing.sentences;

import designPatterns.exercises.n7_bombing.logic.Logic;

public class DoWhile extends ConditionalCompositeSentence {

	public DoWhile(Logic condition) {
		super(condition);
	}

	@Override
	public void exec() {
		do {
			super.exec();
		} while (condition.eval()); 
	}

	@Override
	public String toString() {
		return "\nDoWhile [" +  super.toString() +"\n] DoWhile";
	}
	
	

}
