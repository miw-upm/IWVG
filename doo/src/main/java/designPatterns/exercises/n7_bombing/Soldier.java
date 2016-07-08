package designPatterns.exercises.n7_bombing;

import designPatterns.exercises.n7_bombing.library.Coordinate;
import designPatterns.exercises.n7_bombing.library.Person;

public class Soldier implements Target {

	private Person person;
	
	public Soldier(Coordinate coordinate) {
		person = new Person(coordinate);
	}

	@Override
	public Coordinate getCoordinate() {
		return person.getCoordinate();
	}

	@Override
	public int getDamaged() {
		return person.getInjured();
	}

	@Override
	public boolean isAttacking() {
		return person.isShooting();
	}	
	
}
