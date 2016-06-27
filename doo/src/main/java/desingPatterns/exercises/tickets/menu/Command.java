package desingPatterns.exercises.tickets.menu;

import desingPatterns.exercises.tickets.components.Line;

public abstract class Command {

	private String title;
	
	protected Command(String title){
		this.title = title;
	}
	
	public String getTitle() {
		return title;
	}
	
	public abstract Line execute();

}
