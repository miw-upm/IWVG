package ticTacToe.v270;

public abstract class PutController extends ColocateController {

	public PutController(Game game) {
		super(game, "Pone");
	}

	@Override
	protected void colocate() {
		this.put("En");
	}

}
