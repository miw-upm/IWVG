package designPatterns.exercises.n7_bombing.sentences.tank;

import designPatterns.exercises.n7_bombing.Tank;

public class FireMissile extends TankSentence {
	
	public FireMissile(Tank tank){
		super(tank);
	}
	@Override
	public void exec() {
		tank.fireMissile();
	}

}
