package designPatterns.exercises.n3_manager.v2.manager;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

import designPatterns.exercises.n3_manager.v2.utils.IO;

public class Server {

	private ServerSocket serverSocket;

	private Socket socket;

	private PrintWriter out;

	private BufferedReader in;

	public Server() {
		try {
			serverSocket = new ServerSocket(2020);
			IO.instance().writeln("Servidor> Esperando conexion...");
			socket = serverSocket.accept();
			IO.instance().writeln(
					"Servidor> Recibida conexion de "
							+ socket.getInetAddress().getHostAddress() + ":"
							+ socket.getPort());
			out = new PrintWriter(socket.getOutputStream());
			in = new BufferedReader(new InputStreamReader(
					socket.getInputStream()));
		} catch (IOException ex) {
			ex.printStackTrace();
		}
	}

	public String readLine() {
		String result = null;
		try {
			result = in.readLine();
		} catch (IOException e) {
			System.out.println("Error en servidor!!! Lectura de string");
		}
		return result;
	}

	public void println(int value) {
		out.println(""+value);
		out.flush();
	}
	
	public void println(boolean value) {
		out.println(""+value);
		out.flush();
	}
	
	public void println(String value) {
		out.println(value);
		out.flush();
		
	}

	public void close() {
		try {
			in.close();
			out.close();
			socket.close();
			serverSocket.close();
		} catch (IOException ex) {
			ex.printStackTrace();
		}
	}

}
