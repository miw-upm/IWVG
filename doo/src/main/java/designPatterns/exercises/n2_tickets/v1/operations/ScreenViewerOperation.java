package designPatterns.exercises.n2_tickets.v1.operations;

import designPatterns.exercises.n2_tickets.v1.ticket.CancellationLine;
import designPatterns.exercises.n2_tickets.v1.ticket.Footer;
import designPatterns.exercises.n2_tickets.v1.ticket.Header;
import designPatterns.exercises.n2_tickets.v1.ticket.RepetitionLine;
import designPatterns.exercises.n2_tickets.v1.ticket.ReturnLine;
import designPatterns.exercises.n2_tickets.v1.ticket.SaleLine;

public class ScreenViewerOperation extends TicketOperation {

	@Override
	public void visit(Header head) {
		System.out.println("SCR: Head: " + head.getDate());
	}

	@Override
	public void visit(SaleLine saleLine) {
		System.out
				.println("SCR: Product " + saleLine.getId() + " - "
						+ saleLine.getUnits() + "units : "
						+ saleLine.getPrice() + "eu");
	}

	@Override
	public void visit(RepetitionLine repetitionLine) {
		System.out.println("SCR: Repetition " + repetitionLine.getNumber()
				+ ": " + repetitionLine.getPrice() + "eu");
	}

	@Override
	public void visit(CancellationLine cancellationLine) {
		System.out.println("SCR: Cancelled " + cancellationLine.getNumber()
				+ ": " + cancellationLine.getPrice() + "eu");
	}

	@Override
	public void visit(ReturnLine returnLine) {
		System.out.println("SCR: Devoltion " + returnLine.getId() + " - "
				+ returnLine.getUnits() + ": " + returnLine.getPrice() + "eu");
	}

	@Override
	public void visit(Footer footer) {
		System.out.println("SCR: Foot: " + footer.getTotalPrice());
	}

}
