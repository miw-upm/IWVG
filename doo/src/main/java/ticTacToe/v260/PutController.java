package ticTacToe.v260;

public class PutController extends ColocateController {

	public PutController(Game game, CoordinateController coordinateController) {
		super(game, "Pone", coordinateController);
	}

	@Override
	protected void colocate() {
		this.put("En");
	}

}
