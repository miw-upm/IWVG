package desingPatterns.exercises.tickets.operations;

import desingPatterns.exercises.tickets.components.CancellationLine;
import desingPatterns.exercises.tickets.components.Footer;
import desingPatterns.exercises.tickets.components.Head;
import desingPatterns.exercises.tickets.components.RepetitionLine;
import desingPatterns.exercises.tickets.components.ReturnLine;
import desingPatterns.exercises.tickets.components.SaleLine;

public class PriceCalculatorOperation extends TicketOperation {

	private int total;
	
	public PriceCalculatorOperation() {
		total = 0;
	}	

	@Override
	public void visit(SaleLine line) {
		total += line.getPrice();
	}

	@Override
	public void visit(RepetitionLine line) {
		total += line.getPrice();
	}

	@Override
	public void visit(CancellationLine line) {
		total -= line.getPrice();
	}

	@Override
	public void visit(ReturnLine line) {
		total -= line.getPrice();
	}

	@Override
	public void visit(Footer footer) {
	}
}
