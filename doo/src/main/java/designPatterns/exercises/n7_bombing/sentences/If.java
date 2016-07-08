package designPatterns.exercises.n7_bombing.sentences;

import designPatterns.exercises.n7_bombing.logic.Logic;

public class If extends ConditionalCompositeSentence {

	protected CompositeSentence elseBody;

	public If(Logic condition) {
		super(condition);
		elseBody = new CompositeSentence();
	}

	public CompositeSentence getElse() {
		return elseBody;
	}

	@Override
	public void exec() {
		if (condition.eval()) {
			super.exec();
		} else if (elseBody != null) {
			elseBody.exec();
		}
	}

	@Override
	public String toString() {
		String result = "\nIf [" + super.toString() + "\nelse=";
		result += "\nCompositeSentence [";
		for(Sentence sentence: elseBody.body){
			result += sentence.toString();
		}
		return result + "\n] CompositeSentence\n] If";
	}

}
