package designPatterns.exercises.n2_tickets.v1.ticket;

public abstract class NumberLine extends Line {

	protected int number;
	
	protected NumberLine(int number) {
		this.number = number;
	}

	public int getNumber() {
		return number;
	}

	@Override
	public String toString() {
		return "[number=" + number + super.toString() + "]\n";
	}	
	
}
