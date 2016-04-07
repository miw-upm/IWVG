package ticTacToe.v460.utils;

public class YesNoDialog {

	private static YesNoDialog yesNoDialog;

	public static YesNoDialog instance() {
		if (yesNoDialog == null) {
			yesNoDialog = new YesNoDialog();
		}
		return yesNoDialog;
	}

	private YesNoDialog() {

	}

	public boolean read(String title) {
		assert title != null;
		char answer;
		boolean ok;
		do {
			answer = IO.instance().readChar(title + "? (s/n): ");
			ok = answer == 's' || answer == 'S' || answer == 'n'
					|| answer == 'N';
			if (!ok) {
				IO.instance().writeln("El valor debe ser 's' ó 'n'");
			}
		} while (!ok);
		return answer == 's' || answer == 'S';
	}
}
