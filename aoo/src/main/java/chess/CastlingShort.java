package chess;

public class CastlingShort extends ChessOption {

	public CastlingShort(Controller controller) {
		super("Enroque corto", controller);
	}
	
	public void exec() {
		if (controller.castlingIsPosible()) {
			io.writeln("No se puede enrocar el rey");
		} else {
			controller.enrocar();
		}
		controller.enrocar();
	}
}
