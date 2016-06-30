package desingPatterns.exercises.n2.tickets.menu;

import desingPatterns.exercises.n2.tickets.components.Line;

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
