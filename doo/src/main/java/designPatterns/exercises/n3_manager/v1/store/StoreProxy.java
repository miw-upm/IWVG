package designPatterns.exercises.n3_manager.v1.store;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;

import designPatterns.exercises.n3_manager.v1.manager.Store;

public class StoreProxy implements Store {

	private Socket socketConnection;
	
	private PrintWriter out; 
	
	private BufferedReader in; 
	
	public StoreProxy() {
		System.out.println("Cliente> Establecida conexion");
		try {
			socketConnection = new Socket("localhost", 2020);
			OutputStream outStream = socketConnection.getOutputStream();
			InputStream inStream = socketConnection.getInputStream(); 
			out = new PrintWriter(outStream); 
			in = new BufferedReader( new InputStreamReader(inStream));
		} catch (Exception ex){
			ex.printStackTrace();
			System.exit(0);
		}
	}
	
	@Override
	public void add(int code, int amount) {
		out.println(FrameType.ADD);
		out.println(code);
		out.println(amount);
	}

	@Override
	public boolean exist(int code, int amount) {
		out.println(FrameType.EXIST);
		out.println(code);
		out.println(amount);
		boolean result = false;
		try {
			result = Boolean.parseBoolean(in.readLine());
		} catch (IOException e) {
			e.printStackTrace();
		}
		return result;
	}

	@Override
	public void remove(int code, int amount) {
		out.println(FrameType.REMOVE);
		out.println(code);
		out.println(amount);
	}

	@Override
	public int[][] list() {
		out.println(FrameType.LIST);
		int[][] result = new int[0][2];
		try {
			int lines = Integer.parseInt(in.readLine());
			result = new int[lines][2];
			for(int i=0; i<lines; i++){
				result[i][0] = Integer.parseInt(in.readLine());
				result[i][1] = Integer.parseInt(in.readLine());
			}
		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return result;
	}

}
