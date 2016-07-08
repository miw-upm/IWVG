package designPatterns.exercises.n7_bombing.library;

import java.util.Random;

public class Chariot {

	private Coordinate coordinate;
	
	private int damaged;
	
	public Chariot(Coordinate coordinate){
		this.coordinate = coordinate;
		this.damaged = 0;
	}
	
	public Coordinate getPosition() {
		return coordinate;
	}
	
	public int getDamagedFire() {
		Random random = new Random(System.currentTimeMillis());
		damaged += random.nextInt(10);
		return damaged;
	}
	
	public int getDamagedWheels() {
		Random random = new Random(System.currentTimeMillis());
		damaged += random.nextInt(10);
		return damaged;
	}
	
	public boolean isFiring() {
		Random random = new Random(System.currentTimeMillis());
		return random.nextInt(10)<3;
	}
	
	public void displace(Coordinate coordinate, int minutes) {
		System.out.println("moveTo: " + coordinate + " during " + minutes
				+ " minutes");
	}

	public void turn(int grades) {
		System.out.println("turn: " + grades);
	}

	public void fire(Ammunition ammunition) {
		switch(ammunition){
		case BULLET:
			System.out.println("fireBullet");
			break;
		case MISSILE:
			System.out.println("fireMissile");
			break;
		case SMOKE:
			System.out.println("fireSmoke");
			break;
		}
		
	}

}
