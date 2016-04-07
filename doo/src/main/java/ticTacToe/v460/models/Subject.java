package ticTacToe.v460.models;

public class Subject {

	private Observer observer;
	
	public void register(Observer observer) {
		this.observer = observer;
	}
	
	public void initialize() {
		observer.initialize();
	}
	
	public void begin() {
		observer.begin();
	}
	
	public void end() {
		observer.end();
	}
	
	public void exit() {
		observer.exit();
	}
}
