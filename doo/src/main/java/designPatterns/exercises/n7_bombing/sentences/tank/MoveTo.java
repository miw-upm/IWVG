package designPatterns.exercises.n7_bombing.sentences.tank;

import designPatterns.exercises.n7_bombing.Tank;
import designPatterns.exercises.n7_bombing.library.Coordinate;

public class MoveTo extends TankSentence {
	
	private Coordinate coordinate;
	
	private int minutes;
	
	public MoveTo(Tank tank, Coordinate coordinate, int minutes){
		super(tank);
		this.coordinate = coordinate;
		this.minutes = minutes;
	}
	@Override
	public void exec() {
		tank.moveTo(coordinate, minutes);
	}

}
