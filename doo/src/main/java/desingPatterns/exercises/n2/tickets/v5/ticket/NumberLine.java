package desingPatterns.exercises.n2.tickets.v5.ticket;

public abstract class NumberLine extends Line {

	protected int number;
	
	public NumberLine(int number) {
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
