package desingPatterns.exercises.n2.tickets.v5.frenchConfiguration;

import desingPatterns.exercises.n2.tickets.v5.menu.CancellationLineCommand;
import desingPatterns.exercises.n2.tickets.v5.menu.Menu;
import desingPatterns.exercises.n2.tickets.v5.menu.RepetitionLineCommand;
import desingPatterns.exercises.n2.tickets.v5.menu.SaleLineCommand;

class FrenchMenu extends Menu {
	
	@Override
	protected void setCommands() {
		commandList.add(new SaleLineCommand());
		commandList.add(new RepetitionLineCommand());
		commandList.add(new CancellationLineCommand());
	}

}
