package desingPatterns.exercises.n2.tickets.v5.visitors;

import desingPatterns.exercises.n2.tickets.v5.ticket.CancellationLine;
import desingPatterns.exercises.n2.tickets.v5.ticket.Footer;
import desingPatterns.exercises.n2.tickets.v5.ticket.Head;
import desingPatterns.exercises.n2.tickets.v5.ticket.RepetitionLine;
import desingPatterns.exercises.n2.tickets.v5.ticket.ReturnLine;
import desingPatterns.exercises.n2.tickets.v5.ticket.SaleLine;

public class DisplayViewerOperation extends TicketOperation {

	@Override
	public void visit(Head head) {
		System.out.println("VIE: Head: " + head.getDate());
	}

	@Override
	public void visit(SaleLine saleLine) {
		System.out
				.println("VIE: Product " + saleLine.getId() + " - "
						+ saleLine.getUnits() + "units : "
						+ saleLine.getPrice() + "eu");
	}

	@Override
	public void visit(RepetitionLine repetitionLine) {
		System.out.println("VIE: Repetition " + repetitionLine.getNumber()
				+ ": " + repetitionLine.getPrice() + "eu");
	}

	@Override
	public void visit(CancellationLine cancellationLine) {
		System.out.println("VIE: Cancelled " + cancellationLine.getNumber()
				+ ": " + cancellationLine.getPrice() + "eu");
	}

	@Override
	public void visit(ReturnLine returnLine) {
		System.out.println("VIE: Devoltion " + returnLine.getId() + " - "
				+ returnLine.getUnits() + ": " + returnLine.getPrice() + "eu");
	}

	@Override
	public void visit(Footer footer) {
		System.out.println("VIE: Foot: " + footer.getTotalPrice());
	}

}
