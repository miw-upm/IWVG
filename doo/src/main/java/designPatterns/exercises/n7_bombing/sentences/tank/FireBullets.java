package designPatterns.exercises.n7_bombing.sentences.tank;

import designPatterns.exercises.n7_bombing.Tank;

public class FireBullets extends TankSentence {

	public FireBullets(Tank tank) {
		super(tank);
	}

	@Override
	public void exec() {
		tank.fireBullet();
	}

}