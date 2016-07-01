package desingPatterns.exercises.n2.tickets.v5.visitors;

import desingPatterns.exercises.n2.tickets.v5.Store;
import desingPatterns.exercises.n2.tickets.v5.ticket.CancellationLine;
import desingPatterns.exercises.n2.tickets.v5.ticket.RepetitionLine;
import desingPatterns.exercises.n2.tickets.v5.ticket.ReturnLine;
import desingPatterns.exercises.n2.tickets.v5.ticket.SaleLine;
import desingPatterns.exercises.n2.tickets.v5.ticket.Ticket;

public class PriceCalculatorOperation extends TicketOperation {

	private Ticket ticket;
	
	public PriceCalculatorOperation(Ticket ticket) {
		this.ticket = ticket;
	}	

	@Override
	public void visit(SaleLine saleLine) {
		int price = Store.instance().getPrice(saleLine.getId(), saleLine.getUnits());
		saleLine.setPrice(price);
	}

	@Override
	public void visit(RepetitionLine repetitionLine) {
		SaleLine line = (SaleLine) ticket.getLine(repetitionLine.getNumber());
		int price = Store.instance().getPrice(line.getId(), line.getUnits());
		repetitionLine.setPrice(price);
	}

	@Override
	public void visit(CancellationLine cancellationLine) {
		SaleLine line = (SaleLine) ticket.getLine(cancellationLine.getNumber());
		int price = Store.instance().getPrice(line.getId(), line.getUnits());
		cancellationLine.setPrice(-price);
	}

	@Override
	public void visit(ReturnLine returnLine) {
		int price = Store.instance().getPrice(returnLine.getId(), returnLine.getUnits());
		returnLine.setPrice(-price);
	}

}
