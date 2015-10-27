package chess;

public class ExitOption extends Option {

	private boolean executed;
	
	public ExitOption(){
		super("Salir");
		executed = false;
	}
	
	public void exec(){
		executed = true;
	}
	
	public boolean isExecuted() {
		return executed;
	}

}
