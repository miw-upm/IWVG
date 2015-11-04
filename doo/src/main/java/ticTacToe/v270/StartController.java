package ticTacToe.v270;

public class StartController extends Controller {

	private ColocateController[][] colocateControllerArray;

	protected StartController(Game game) {
		super(game);
		colocateControllerArray = new ColocateController[2][2];
	}

	@Override
	public void control() {
		assert this.getState() == State.INITIAL;
		int users = new LimitedIntDialog("Cuántos usuarios?", 0, 2).read();
		colocateControllerArray = new ColocateController[2][2];
		for (int i = 0; i < 2; i++) {
			if (i<users){
				colocateControllerArray[i][0] = new RandomPutController(this.getGame());
				colocateControllerArray[i][1] = new RandomPutController(this.getGame());
			} else {
				colocateControllerArray[i][0] = new ManualPutController(this.getGame());
				colocateControllerArray[i][1] = new ManualPutController(this.getGame());
			}
		}
		this.getBoard().write();
		this.setState(State.IN_GAME);
	}

	public ColocateController[][] getColocateControllerArray() {
		return colocateControllerArray;
	}
}
