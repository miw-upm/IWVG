package designPatterns.exercises.n1_io.v4_subclassification;

public abstract class IO {
	
	private static IO io;
	
	public static IO instance() {
		if (io == null){
			io = new JavaIO();
		}
		return io;
	}
	
	protected IO(){
		
	}
	
	public abstract String readString(String title);

	public abstract int readInt(String title);

	public abstract char readChar(String title);

	public abstract void writeln();
	
	public abstract void write(String string);
	
	public abstract void writeln(String string);

}
