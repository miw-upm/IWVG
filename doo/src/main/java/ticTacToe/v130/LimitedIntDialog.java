package ticTacToe.v130;

public class LimitedIntDialog {

	private String title;
	
	private int min;
	
	private int max;
	
	public LimitedIntDialog(String title, int min, int max){
		this.title = title + " [" + min + ", " + max + "]: ";
		this.min = min;
		this.max = max;
	}
	
	public LimitedIntDialog(String title, int max){
		this(title, 1, max);
	}
	
	public int read(){
		IO io = new IO();
		int value;
		boolean ok;
		do {
			value = io.readInt(title);
			ok = min <= value && value <= max;
			if (!ok) {
				io.writeln("El valor debe estar entre [" + min + ", " + max + "]");
			}
		} while (!ok);
		return value;
	}
}
