package desingPatterns.tickets.menu;

import desingPatterns.tickets.components.Line;

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
