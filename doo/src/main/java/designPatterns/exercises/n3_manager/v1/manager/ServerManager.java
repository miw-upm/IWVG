package designPatterns.exercises.n3_manager.v1.manager;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

import designPatterns.exercises.n3_manager.v1.dispatchers.Dispatcher;
import designPatterns.exercises.n3_manager.v1.store.FrameType;
import designPatterns.exercises.n3_manager.v1.store.StoreImplementation;
import designPatterns.exercises.n3_manager.v1.utils.IO;

public class ServerManager {

	private Store store;
	
	private ServerSocket serverSocket;
	
	private PrintWriter out;
	
	private BufferedReader in;
	
	public ServerManager() {
		store = new StoreImplementation();
		try {
			serverSocket = new ServerSocket(2020);
			IO.instance().writeln("Servidor> Esperando conexion...");
			Socket socket = serverSocket.accept();
			IO.instance().writeln("Servidor> Recibida conexion de "
					+ socket.getInetAddress().getHostAddress() + ":"
					+ socket.getPort());
			OutputStream outStream = socket.getOutputStream();
			InputStream inStream = socket.getInputStream(); 
			out = new PrintWriter(outStream); 
			in = new BufferedReader( new InputStreamReader(inStream));
		} catch (IOException ex) {
			ex.printStackTrace();
		}
	}
	
	private void serve() {
		while(true){
			try {
				FrameType frameType = FrameType.parser(in.readLine());
				
			} catch (IOException ex) {
				ex.printStackTrace();
			}
		}
	}
	
	public static void main(String[] args){
		new ServerManager().serve();
	}

}
