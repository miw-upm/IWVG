package ticTacToe.v300;

public class MoveController extends ColocateController {

	private TicTacToeCoordinate origin;
	
	public MoveController(Game game, CoordinateController coordinateController) {
		super(game, "Mueve", coordinateController);
	}

	@Override
	protected void colocate() {
		this.remove();
		this.put("A");
	}
	
	private void remove(){
		Error error;
		do {
			origin = this.getCoordinateController().getOrigin();
			error = this.validateOrigin();
			if (error != null){
				new IO().writeln(""+error);
			}
		} while (error != null);	
		this.remove(origin);
	}

	private Error validateOrigin() {
		if (!this.full(origin)) {
			return Error.NOT_PROPERTY;
		}
		return null;
	}

	@Override
	protected Error validateTarget() {
		Error error = super.validateTarget();
		if (error != null) {
			return error;
		}
		if (origin.equals(this.getTarget())) {
				return Error.REPEATED_COORDINATE;
		}
		return null;
	}
	
	
	
}
