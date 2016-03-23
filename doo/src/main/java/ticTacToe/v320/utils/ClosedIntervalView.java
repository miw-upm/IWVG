package ticTacToe.v320.utils;

public class ClosedIntervalView {

	private String title;
	
	private ClosedInterval closedInterval;
	
	private IO io;
	
	public ClosedIntervalView(String title, ClosedInterval closedInterval){
		assert title != null;
		assert closedInterval != null;
		this.title = title;
		this.closedInterval = closedInterval;
		io = new IO();
	}
	
	public void writeln() {
		io.writeln(title + " " + this.toString());
	}
	
	@Override
	public String toString() {
		return "[" + closedInterval.getMin() + ", " + closedInterval.getMax() + "]";
	}
}
