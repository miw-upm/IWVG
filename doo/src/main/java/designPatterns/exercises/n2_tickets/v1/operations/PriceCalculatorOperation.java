package designPatterns.exercises.n2_tickets.v1.operations;

import designPatterns.exercises.n2_tickets.v1.store.Store;
import designPatterns.exercises.n2_tickets.v1.ticket.CancellationLine;
import designPatterns.exercises.n2_tickets.v1.ticket.RepetitionLine;
import designPatterns.exercises.n2_tickets.v1.ticket.ReturnLine;
import designPatterns.exercises.n2_tickets.v1.ticket.SaleLine;

public class PriceCalculatorOperation extends TicketOperation {
	
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
