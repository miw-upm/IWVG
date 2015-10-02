package ticTacToe.version210;

public abstract class  ColocateView {
	
	protected ColocateController colocateController;
	
	private String title;
	
	protected IO io;
	
	protected ColocateView(ColocateController colocateController, String title){
		this.colocateController = colocateController;
		this.title = title;
		io = new IO();
	}

	public void render() {
		char colorValue = colocateController.getColor().getValue();
		io.writeln(title + " el jugador " + colorValue);
		this.colocate(colorValue);
		new BoardView(colocateController.getBoard()).render();
		if (colocateController.isGameOver()) {
			io.writeln("Victoria!!!! " 
					+ colorValue + "! "
					+ colorValue + "! "
					+ colorValue + "! Victoria!!!!");
		} else {
			colocateController.close();
		}
	}

	protected abstract void colocate(char color);
}
