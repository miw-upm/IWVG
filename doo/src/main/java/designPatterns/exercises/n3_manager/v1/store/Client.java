package designPatterns.exercises.n3_manager.v1.store;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;

public class Client {

	private Socket socket;
	
	private PrintWriter out; 
	
	private BufferedReader in; 
	
	Client() {
		try {
			socket = new Socket("localhost", 2020);
			System.out.println("Cliente> Establecida conexion");
			OutputStream outStream = socket.getOutputStream();
			InputStream inStream = socket.getInputStream(); 
			out = new PrintWriter(outStream); 
			in = new BufferedReader( new InputStreamReader(inStream));
		} catch (Exception ex){
			ex.printStackTrace();
			System.exit(0);
		}
	}
	
	public void println(String value){
		out.println(value);
		out.flush();
	}
	
	public void println(int value){
		this.println(""+value);
	}
	
	public boolean readBoolean(){
		boolean result = false;
		try {
			result = Boolean.parseBoolean(in.readLine());
		} catch (IOException e) {
			e.printStackTrace();
		}
		return result;
	}
	
	public int readInt(){
		int result = -1;
		try {
			result = Integer.parseInt(in.readLine());
		} catch (IOException e) {
			e.printStackTrace();
		}
		return result;
	}
	
	public void close() {
		try {
			this.println(FrameType.CLOSE.name());
			in.close();
			out.close();
			socket.close();
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
}
