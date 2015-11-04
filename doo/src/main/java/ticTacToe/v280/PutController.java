package ticTacToe.v280;

public class PutController extends ColocateController {

	public PutController(Game game, CoordinateController coordinateController) {
		super(game, "Pone", coordinateController);
	}

	@Override
	protected void colocate() {
		this.put("En");
	}

}
