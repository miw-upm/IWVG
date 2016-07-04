package designPatterns.exercises.n2_tickets.v1.ticket;

public abstract class IdLine extends Line {

	protected int id;

	protected int units;

	protected IdLine(int id, int units) {
		this.id = id;
		this.units = units;
	}
	
	public int getId() {
		return id;
	}
	
	public int getUnits() {
		return units;
	}

	@Override
	public String toString() {
		return "[id=" + id + ", units=" + units + super.toString() + "]\n";
	}

}
