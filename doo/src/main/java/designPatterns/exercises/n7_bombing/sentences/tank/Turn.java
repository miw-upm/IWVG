package designPatterns.exercises.n7_bombing.sentences.tank;

import designPatterns.exercises.n7_bombing.Tank;

public class Turn extends TankSentence {
	
	private int grades;
	
	public Turn(Tank tank, int grades){
		super(tank);
		this.grades = grades;
	}
	@Override
	public void exec() {
		tank.turn(grades);
	}

}
