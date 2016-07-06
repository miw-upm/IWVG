package designPatterns.exercises.n1_io.v4_subclassification;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public abstract class IO {
	
	private static IO io;
	
	public static IO instance() {
		if (io == null){
			String line = IO.getSingletonConfigure();
			try {
				io = (IO) (Class
						.forName("designPatterns.exercises.n1_io.v4_subclassification."
								+ line).newInstance());
			} catch (InstantiationException e) {
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				e.printStackTrace();
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
		}
		return io;
	}
		
	private static String getSingletonConfigure() {
		BufferedReader in = null;
		String line = "";
		try {
			in = new BufferedReader(new FileReader("facade"));
			line = in.readLine().substring(13);
		} catch (IOException ex) {
			System.out.println("IOException al leer: " + ex.getMessage());
		} finally {
			if (in != null) {
				try {
					in.close();
				} catch (IOException ex) {
					System.out.println("IOException al cerrar: "
							+ ex.getMessage());
				}
			}
		}
		return line;
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
