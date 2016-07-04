package designPatterns.exercises.n2_tickets.v1.ticket;

import java.util.ArrayList;
import java.util.List;

public class Ticket {

	private Header header;

	private List<Line> lineList;

	private Footer footer;

	private TicketVisitor lineTicketOperation;

	private TicketVisitor globalTickeOperation;

	public Ticket(Header header, Footer footer) {
		this.header = header;
		this.lineList = new ArrayList<Line>();
		this.footer = footer;
	}
	
	public void setLineTicketOperation(TicketVisitor lineTicketOperation) {
		this.lineTicketOperation = lineTicketOperation;
	}
	
	public void setGlobalTicketOperation(TicketVisitor globalTickeOperation) {
		this.globalTickeOperation = globalTickeOperation;
	}
	
	public void open() {
		header.accept(lineTicketOperation);
	}

	public void add(Line line) {
		lineList.add(line);
		line.accept(lineTicketOperation);
	}
	
	public void close() {
		footer.accept(lineTicketOperation);
		header.accept(globalTickeOperation);
		for (Line line : lineList) {
			line.accept(globalTickeOperation);
		}
		footer.accept(globalTickeOperation);
	}

	public int lines() {
		return lineList.size();
	}

	public Line getLine(int number) {
		return lineList.get(number);
	}

	@Override
	public String toString() {
		return "Ticket [\n head=" + header + "\n, lines=" + lineList
				+ "\n, footer=" + footer + "]";
	}

}
