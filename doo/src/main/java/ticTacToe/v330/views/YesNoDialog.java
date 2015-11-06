package ticTacToe.v330.views;

import ticTacToe.v330.utils.IO;

class YesNoDialog {

	private String title;
	
	YesNoDialog(String title){
		assert title != null;
		this.title = title;
	}
	
	boolean read(){
		char answer;
		IO io = new IO();
		boolean ok;
		do {
			answer = io.readChar(title + "? (s/n): ");
			ok = answer == 's' || answer == 'S' || answer == 'n'
					|| answer == 'N';
			if (!ok) {
				io.writeln("El valor debe ser 's' ó 'n'");
			}
		} while (!ok);
		return answer=='s' || answer=='S';
	}
}
