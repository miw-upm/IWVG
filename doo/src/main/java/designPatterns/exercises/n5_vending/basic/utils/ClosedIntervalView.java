package designPatterns.exercises.n5_vending.basic.utils;


class ClosedIntervalView {

	private String title;
	
	private ClosedInterval closedInterval;
	
	public ClosedIntervalView(String title, ClosedInterval closedInterval){
		assert title != null;
		assert closedInterval != null;
		this.title = title;
		this.closedInterval = closedInterval;
	}
	
	public void writeln() {
		IO.instance().writeln(title + " " + this.toString());
	}
	
	@Override
	public String toString() {
		return "[" + closedInterval.getMin() + ", " + closedInterval.getMax() + "]";
	}
}
