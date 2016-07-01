package desingPatterns.exercises.n2.tickets.v5.visitors;

import java.util.ArrayList;
import java.util.List;

import desingPatterns.exercises.n2.tickets.v5.ticket.CancellationLine;
import desingPatterns.exercises.n2.tickets.v5.ticket.Footer;
import desingPatterns.exercises.n2.tickets.v5.ticket.Head;
import desingPatterns.exercises.n2.tickets.v5.ticket.RepetitionLine;
import desingPatterns.exercises.n2.tickets.v5.ticket.ReturnLine;
import desingPatterns.exercises.n2.tickets.v5.ticket.SaleLine;
import desingPatterns.exercises.n2.tickets.v5.ticket.Ticket;

public class TicketOperationComposite extends TicketOperation {

	private List<TicketOperation> ticketOperationList;
	
	public TicketOperationComposite() {
		ticketOperationList = new ArrayList<TicketOperation>();
	}
	
	public void add(TicketOperation ticketOperation) {
		ticketOperationList.add(ticketOperation);
	}
	
	@Override
	public void set(Ticket ticket) {
		for(TicketOperation ticketOperation: ticketOperationList) {
			ticketOperation.set(ticket);
		}
	}
	
	@Override
	public void visit(Head head) {
		for(TicketOperation ticketOperation : ticketOperationList){
			ticketOperation.visit(head);
		}
	}

	@Override
	public void visit(SaleLine saleLine) {
		for(TicketOperation ticketOperation : ticketOperationList){
			ticketOperation.visit(saleLine);
		}
	}

	@Override
	public void visit(RepetitionLine repetitionLine) {
		for(TicketOperation ticketOperation : ticketOperationList){
			ticketOperation.visit(repetitionLine);
		}
	}

	@Override
	public void visit(CancellationLine cancellationLine) {
		for(TicketOperation ticketOperation : ticketOperationList){
			ticketOperation.visit(cancellationLine);
		}
	}

	@Override
	public void visit(ReturnLine returnLine) {
		for(TicketOperation ticketOperation : ticketOperationList){
			ticketOperation.visit(returnLine);
		}
	}

	@Override
	public void visit(Footer footer) {
		for(TicketOperation ticketOperation : ticketOperationList){
			ticketOperation.visit(footer);
		}
	}
}
