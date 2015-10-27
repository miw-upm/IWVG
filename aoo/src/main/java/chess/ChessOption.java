package chess;

public abstract class ChessOption extends Option {

	protected Controller controller;
	
	protected ChessOption(String title, Controller controller){
		super(title);
		this.controller = controller;
	}
}
