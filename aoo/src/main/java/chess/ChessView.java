package chess;

public class ChessView {

	private IO io = new IO();

	private Controller controller;

	public ChessView(Controller controller) {
		this.controller = controller;
		io = new IO();
	}

	public void interact() {
		do {
			io.writeln("Turno para las " + controller.getColor());
			
				
				break;
			case 2:
				
				break;
			}
		} while (controller.isGameOver());
	}

}
