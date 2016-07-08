package designPatterns.exercises.n7_bombing.library;

import java.util.Random;

public class Person {

	private Coordinate coordinate;
	
	private int injured;
	
	public Person(Coordinate coordinate){
		this.coordinate = coordinate;
		this.injured = 0;
	}
	
	public Coordinate getCoordinate() {
		return coordinate;
	}
	
	public int getInjured() {
		Random random = new Random(System.currentTimeMillis());
		injured += random.nextInt(10);
		return injured;
	}
	
	public boolean isShooting() {
		Random random = new Random(System.currentTimeMillis());
		return random.nextInt(10)<3;
	}
}
