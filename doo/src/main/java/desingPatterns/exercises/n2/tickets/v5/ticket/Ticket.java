package desingPatterns.exercises.n2.tickets.v5.ticket;

import java.util.ArrayList;
import java.util.List;

import desingPatterns.exercises.n2.tickets.v5.visitors.TicketOperation;

public class Ticket {

	private Head head;

	private List<Line> lineList;

	private Footer footer;

	private TicketOperation lineTicketOperation;

	private TicketOperation globalTickeOperation;

	public Ticket(Head head, Footer footer,
			TicketOperation lineTicketOperation,
			TicketOperation globalTickeOperation) {
		this.head = head;
		this.lineList = new ArrayList<Line>();
		this.footer = footer;
		this.lineTicketOperation = lineTicketOperation;
		this.globalTickeOperation = globalTickeOperation;
		head.accept(lineTicketOperation);
	}

	public void add(Line line) {
		lineList.add(line);
		line.accept(lineTicketOperation);
	}

	public int lines() {
		return lineList.size();
	}

	public Line getLine(int number) {
		return lineList.get(number);
	}

	public void close() {
		footer.accept(lineTicketOperation);
		head.accept(globalTickeOperation);
		for (Line line : lineList) {
			line.accept(globalTickeOperation);
		}
		footer.accept(globalTickeOperation);
	}

	@Override
	public String toString() {
		return "Ticket [\n head=" + head + "\n, lines=" + lineList
				+ "\n, footer=" + footer + "]";
	}

}
