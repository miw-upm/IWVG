package designPatterns.exercises.n7_bombing;

import designPatterns.exercises.n7_bombing.library.Ammunition;
import designPatterns.exercises.n7_bombing.library.Chariot;
import designPatterns.exercises.n7_bombing.library.Coordinate;

public class Tank implements Target {

	private Chariot chariot;

	public Tank(Coordinate coordinate) {
		chariot = new Chariot(coordinate);
	}

	@Override
	public Coordinate getCoordinate() {
		return chariot.getPosition();
	}

	@Override
	public int getDamaged() {
		return chariot.getDamagedFire() / 2 
				+ chariot.getDamagedWheels() / 2;
	}

	@Override
	public boolean isAttacking() {
		return chariot.isFiring();
	}

	public void fireBullet() {
		chariot.fire(Ammunition.BULLET);
	}

	public void fireMissile() {
		chariot.fire(Ammunition.MISSILE);
	}

	public void fireSmoke() {
		chariot.fire(Ammunition.SMOKE);
	}

	public void moveTo(Coordinate coordinate, int minutes) {
		chariot.displace(coordinate, minutes);
	}

	public void turn(int grades) {
		chariot.turn(grades);		
	}

}
