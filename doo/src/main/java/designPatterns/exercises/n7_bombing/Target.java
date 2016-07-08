package designPatterns.exercises.n7_bombing;

import designPatterns.exercises.n7_bombing.library.Coordinate;

public interface Target {
	
	public Coordinate getCoordinate();
	
	public int getDamaged();
	
	public boolean isAttacking();
	
}
