package designPatterns.exercises.n7_bombing;

import designPatterns.exercises.n7_bombing.library.Coordinate;

public class Interpreter {

	private void interpret() {
		Tank tank = new Tank(new Coordinate(0,0));
		Target target = new Soldier(new Coordinate(40,100));
		ScriptBuilder sB = new ScriptBuilder(tank, target);
		sB.MOVE_TO(new Coordinate(20,100),20);
		sB.FOR(5);
			sB.FIRE_SMOKE();
			sB.FIRE_MISSILE();
		sB.ENDFOR();
		sB.TURN(180);
		sB.MOVE_TO(new Coordinate(0,0),10);
		sB.IF(
			sB.AND(
				sB.IS_ATTACKING(), 
				sB.GREATER(
					sB.GET_DAMANGE(),
					sB.LITERAL(20)
					)));
			sB.MOVE_TO(new Coordinate(20,100),30);
		sB.ELSE();
			sB.TURN(90);
			sB.MOVE_TO(new Coordinate(0,0),15);
		sB.ENDIF();
		System.out.println("----------");
		sB.build().exec();
	}
	
	public static void main(String[] args){
		new Interpreter().interpret();
	}
}
