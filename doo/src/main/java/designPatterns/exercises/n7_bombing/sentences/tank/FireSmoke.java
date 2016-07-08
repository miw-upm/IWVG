package designPatterns.exercises.n7_bombing.sentences.tank;

import designPatterns.exercises.n7_bombing.Tank;

public class FireSmoke extends TankSentence {
	
	public FireSmoke(Tank tank){
		super(tank);
	}
	@Override
	public void exec() {
		tank.fireSmoke();
	}

}
