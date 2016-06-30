package desingPatterns.exercises.n2.tickets;


public class RepetitionLineCommand extends Command {

	public RepetitionLineCommand() {
		super("Linea de repetición");
	}

	@Override
	public Line execute() {
		int line = LimitedIntDialog.instance().read("Línea", 1000);
		return new RepetitionLine(line);
	}
}
