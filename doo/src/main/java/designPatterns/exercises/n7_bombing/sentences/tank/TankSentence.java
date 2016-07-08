package designPatterns.exercises.n7_bombing.sentences.tank;

import designPatterns.exercises.n7_bombing.Tank;
import designPatterns.exercises.n7_bombing.sentences.Sentence;

public abstract class TankSentence extends Sentence {

	protected Tank tank;
	
	protected TankSentence(Tank tank){
		this.tank = tank;
	}
}
