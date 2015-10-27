package chess;

public class MoveOption extends ChessOption {
	
	public MoveOption(Controller controller){
		super("Mover ficha", controller);
	}
	
	public void exec() {
		Coordinate origin;
		boolean ok;
		do {
			origin = new Coordinate();
			origin.read("Que ficha desea mover?");
			ok = controller.isPosibleToMove(origin);
			if (!ok) {
				io.writeln("La ficha de esa posición no la puede mover");
			}
		} while (ok);
		Coordinate target;
		do {
			target = new Coordinate();
			target.read("Que ficha desea mover?");
			ok = controller.isPosibleToMove(origin);
			if (!ok) {
				io.writeln("La ficha no se puede mover a esa posición");
			}
		} while (ok);
		controller.move(origin, target);
	}
}
