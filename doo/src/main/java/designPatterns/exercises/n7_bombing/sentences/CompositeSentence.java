package designPatterns.exercises.n7_bombing.sentences;

import java.util.ArrayList;
import java.util.List;

public class CompositeSentence extends Sentence {

	protected List<Sentence> body;

	public CompositeSentence() {
		super();
		body = new ArrayList<Sentence>();
	}
	
	public void add(Sentence sentence){
		body.add(sentence);
	}

	@Override
	public void exec() {
		for(Sentence sentence : body){
			sentence.exec();
		}
	}

	@Override
	public String toString() {
		String result = "\nCompositeSentence [";
		for(Sentence sentence: body){
			result += sentence.toString();
		}
		return result + "\n] CompositeSentence";
	}
	
}
