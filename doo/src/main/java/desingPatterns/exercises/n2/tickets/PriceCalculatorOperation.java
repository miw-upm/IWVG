package desingPatterns.exercises.n2.tickets;


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
