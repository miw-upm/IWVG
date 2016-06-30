package desingPatterns.exercises.n2.tickets;

import java.util.ArrayList;
import java.util.List;

public class TicketOperationComposite extends TicketOperation {

	private List<TicketOperation> ticketOperations;
	
	public TicketOperationComposite() {
		ticketOperations = new ArrayList<TicketOperation>();
	}
	
	public void add(TicketOperation ticketOperation) {
		ticketOperations.add(ticketOperation);
	}
	
	@Override
	public void visit(Head head) {
		for(TicketOperation ticketOperation : ticketOperations){
			ticketOperation.visit(head);
		}
	}

	@Override
	public void visit(SaleLine line) {
		for(TicketOperation ticketOperation : ticketOperations){
			ticketOperation.visit(line);
		}
	}

	@Override
	public void visit(RepetitionLine line) {
		for(TicketOperation ticketOperation : ticketOperations){
			ticketOperation.visit(line);
		}
	}

	@Override
	public void visit(CancellationLine line) {
		for(TicketOperation ticketOperation : ticketOperations){
			ticketOperation.visit(line);
		}
	}

	@Override
	public void visit(ReturnLine line) {
		for(TicketOperation ticketOperation : ticketOperations){
			ticketOperation.visit(line);
		}
	}

	@Override
	public void visit(Footer footer) {
		for(TicketOperation ticketOperation : ticketOperations){
			ticketOperation.visit(footer);
		}
	}
}
