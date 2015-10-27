package chess;

public abstract class Option {

	private String title;
	
	protected static IO io;
	
	protected Option(String title){
		this.title = title;
		io = new IO();
	}
	
	public String getTitle() {
		return title;
	}
	
	public abstract void exec();
}
